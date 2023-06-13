SUMMARY = "Shared binary to play games developed with the Godot engine"
DESCRIPTION = "This package contains a godot-runner binary for the Linux X11 platform, \
which can be used to run any game developed with the Godot engine simply \
by pointing to the location of the game's data package."
LICENSE = "MIT"

PV = "4.0.3"

RPM_NAME = "godot-runner-4.0.3-1.1.aarch64.rpm"
RPM_HASH = "a79d5a47f7ee0fcc34076cab8d44fd21fb2efb9e3523608d5cc903907cf2734ffb88f94e9ab3421ca5fef259a8ef6c34e2f11dece9c4ea32aece0387c3c43de2"

RPROVIDES:${PN} += "godot-runner \
godot-runner(aarch-64)"

RDEPENDS:${PN} += "ca-certificates \
ld-linux-aarch64.so.1()(64bit) \
libSPIRV.so.12()(64bit) \
libX11.so.6()(64bit) \
libXcursor.so.1()(64bit) \
libXext.so.6()(64bit) \
libXi.so.6()(64bit) \
libXinerama.so.1()(64bit) \
libXrandr.so.2()(64bit) \
libXrender.so.1()(64bit) \
libasound.so.2()(64bit) \
libc.so.6()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libglslang.so.12()(64bit) \
libgraphite2.so.3()(64bit) \
libharfbuzz-icu.so.0()(64bit) \
libharfbuzz.so.0()(64bit) \
libm.so.6()(64bit) \
libmbedcrypto.so.7()(64bit) \
libmbedtls.so.14()(64bit) \
libmbedx509.so.1()(64bit) \
libminiupnpc.so.17()(64bit) \
libogg.so.0()(64bit) \
libpcre2-32.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libsharpyuv.so.0()(64bit) \
libspeechd.so.2()(64bit) \
libstdc++.so.6()(64bit) \
libtheora.so.0()(64bit) \
libtheoradec.so.1()(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libvorbis.so.0()(64bit) \
libvorbisfile.so.3()(64bit) \
libwebp.so.7()(64bit) \
libwslay.so.0()(64bit) \
libxkbcommon.so.0()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
