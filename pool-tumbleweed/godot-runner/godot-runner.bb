SUMMARY = "Shared binary to play games developed with the Godot engine"
DESCRIPTION = "This package contains a godot-runner binary for the Linux X11 platform, \
which can be used to run any game developed with the Godot engine simply \
by pointing to the location of the game's data package."
LICENSE = "MIT"

PV = "4.1.1"

RPM_NAME = "godot-runner-4.1.1-1.2.aarch64.rpm"
RPM_HASH = "bbf7caeb4ebc296638bc0c54fdd0aabbe1001d36b6c54ed97a0891f637d84fe0cef6399f155fc4f518403e6bc2bf652d2bd6d533260ff1fb80c2c9cef35a069b"

RPROVIDES:${PN} += "godot-runner"

RDEPENDS:${PN} += "ca-certificates \
ld-linux-aarch64.so.1 \
libSPIRV.so.13 \
libX11.so.6 \
libXcursor.so.1 \
libXext.so.6 \
libXi.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libXrender.so.1 \
libasound.so.2 \
libbrotlicommon.so.1 \
libbrotlidec.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libglslang.so.13 \
libgraphite2.so.3 \
libharfbuzz-icu.so.0 \
libharfbuzz.so.0 \
libm.so.6 \
libmbedcrypto.so.7 \
libmbedtls.so.14 \
libmbedx509.so.1 \
libminiupnpc.so.17 \
libogg.so.0 \
libpcre2-32.so.0 \
libpng16.so.16 \
libpulse.so.0 \
libspeechd.so.2 \
libstdc++.so.6 \
libtheora.so.0 \
libtheoradec.so.1 \
libudev.so.1 \
libvorbis.so.0 \
libvorbisfile.so.3 \
libwebp.so.7 \
libwslay.so.0 \
libxkbcommon.so.0 \
libz.so.1 \
libzstd.so.1"

inherit rpm
