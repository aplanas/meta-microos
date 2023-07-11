SUMMARY = "Audio library with an OpenGL-resembling API"
DESCRIPTION = "OpenAL is an audio library designed in the spirit of the OpenGL API. \
 \
OpenAL provides capabilities for playing audio in a virtual 3D \
environment. Distance attenuation, doppler shift, and directional \
sound emitters are among the features handled by the API. More \
advanced effects, including air absorption, occlusion, and \
environmental reverb, are available through the EFX extension. It \
also facilitates streaming audio, multi-channel buffers, and audio \
capture."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "libopenal1-1.22.2-1.5.aarch64.rpm"
RPM_HASH = "cb22190e8a0700f7c4fd13da7fed8bbe130f62575cee6733bd18e3e55316e9ca4a763e668ec6fbc634fcd26e1c373e932a1ac61cfe5fdccba605269ee9377f2f"

RPROVIDES:${PN} += "libopenal.so.1 \
libopenal1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libportaudio.so.2 \
libpulse.so.0 \
libstdc++.so.6"

inherit rpm
