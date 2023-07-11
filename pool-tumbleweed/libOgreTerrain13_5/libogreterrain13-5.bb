SUMMARY = "Ogre Terrain System component"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
The Ogre Terrain System features: \
 \
* SceneManager independent, integrates with (optional) Paging component \
* Hierarchical geometry batching: batch count reduced at lower LODs as well as \
  vertex count. At the lowest level of detail, the entire terrain page is a \
  single batch which has obvious advantages for large paging terrains over the \
  fixed tiles previously used. \
* Skirts are used instead of stitching to avoid cracks in geometry. This means \
  fewer indexing arrangements and lower overall index buffer usage. \
* Built-in support for splatting layers, configurable sampler inputs and \
  pluggable material generators. \
* Support for generating global normal maps and light maps in a background \
  thread. \
* LOD now adapts in real-time to camera settings (viewport sizes & LOD bias) so \
  you can use the same terrain with multiple views efficiently."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreTerrain13_5-13.5.3-2.2.aarch64.rpm"
RPM_HASH = "db869190a0a639a6385e4ec99cbabeb050476fe2ff82e8c9338d394d31efb93b0b6fba8ff5d8405c9119846245f899f1e07c831b34bafc1c47c6187dee0955c8"

RPROVIDES:${PN} += "libOgreTerrain.so.13.5 \
libOgreTerrain13-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOgreMain.so.13.5 \
libOgrePaging.so.13.5 \
libOgreRTShaderSystem.so.13.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
