SUMMARY = "Utility to compile XKB keyboard description"
DESCRIPTION = "The xkbcomp keymap compiler converts a description of an XKB keymap \
into one of several output formats."
LICENSE = "MIT"

PV = "1.4.6"

RPM_NAME = "xkbcomp-1.4.6-1.2.aarch64.rpm"
RPM_HASH = "196f6a559e081ae8b04d3e485478f4ad38c07557a246fd370057d4cabc73bed1d308850403212dd6614522c782afdb4f4e25ef0bddf2fe8ef3995ecba45a6189"

RPROVIDES:${PN} += "xkbcomp \
xkbcomp(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libxkbfile.so.1()(64bit)"

inherit rpm
