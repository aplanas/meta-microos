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

RPM_NAME = "libopenal1-1.22.2-1.4.aarch64.rpm"
RPM_HASH = "3f693e2cf4dfa1f91119985d1d7a416259fb8d1593454294b5bb711af0f9f77809d924374075dcfeb85fd9f8d7b0198c72db3c7ea2fe9449c156e2aa92b5e6bf"

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
