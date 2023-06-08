SUMMARY = "Touch with mkdir tool"
DESCRIPTION = "Bonk is a touch alternative with an added feature to \
create directories."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "bonk-0.3.2-1.2.aarch64.rpm"
RPM_HASH = "fc12cd152149920d0771f2c798d500e1315dea436d24ce9057e52eb38eb82facc2906429bb2cf411dfaacb5b39598bcd3656d8ab54afa607ad8f8d74d29c355d"

RPROVIDES:${PN} += "bonk bonk(aarch-64) bundled(rust-crate:bonky)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit)"

inherit rpm
