SUMMARY = "Ogre Runtime Shader System"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
This component is used to generate shaders on the fly, based on object material \
properties, scene setup and other user definitions. \
 \
* Runtime shader generation synchronized with scene state. Each time scene \
  settings change, a new set of shaders is generated. \
* Full FFP (Fixed Function Pipeline) emulation. This feature is most useful \
  combined with render system that does not provide any FFP functionality \
  (OpenGL ES 2.0, D3D10, D3D11, etc.). \
* Shader language independent interface: the logic representation of the shader \
  programs is completely independent from the target shader language. \
* Pluggable interface allows extending the target shader languages set and \
  adding new shader-based effects to the system in a seamless way. Each effect \
  code will be automatically combined with the rest of the shader code. \
* Automatic vertex shader compacting mechanism: no more compacting variables by \
  hand. In case the amount of used vertex shader output registers exceeds the \
  maximum allowed (12 to 32, depending on D3DPSHADERCAPS2_0.NumTemps(external \
  link)), a compacting algorithm packs the vertex shader outputs and adds \
  unpack code in the fragment shader side. \
* Material script support, for both export and import."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreRTShaderSystem13_5-13.5.3-2.2.aarch64.rpm"
RPM_HASH = "21d4e49ba6deed0c994432586735101f1a8661b3c28fbe27cff188eda485940fe59e0a191d382e504046cb12ae670dde294e17518781de5eb6497108e3669d5e"

RPROVIDES:${PN} += "libOgreRTShaderSystem.so.13.5 \
libOgreRTShaderSystem13-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOgreMain.so.13.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
