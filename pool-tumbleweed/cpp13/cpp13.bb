SUMMARY = "The GCC Preprocessor"
DESCRIPTION = "This Package contains just the preprocessor that is used by the X11 \
packages."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cpp13-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "a48b0cf8b7726c85d00d8aafb275a7b2e1bab0662c64d6fb325450c622f1111df95e9de89a0f1869c140e576bd5286d6606fc724df5687ef3b7a4b1339db0fc6"

RPROVIDES:${PN} += "cpp13"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
