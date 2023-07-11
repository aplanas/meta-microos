SUMMARY = "The Colm programming language runtime"
DESCRIPTION = "Colm is a programming language designed for the analysis and \
transformation of computer languages."
LICENSE = "MIT"

PV = "0.14.7"

RPM_NAME = "libcolm-0_14_7-0.14.7-2.5.aarch64.rpm"
RPM_HASH = "9222e9459ac8ef9f04fdc4c13c5201e07be78664eb50e1422801040fc260b070bc8ee29586adbf9c4eb3b7af26ebd8c4f03f053466bbe900d22dc6dac09f98b2"

RPROVIDES:${PN} += "libcolm-0-14-7 \
libcolm-0.14.7.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
