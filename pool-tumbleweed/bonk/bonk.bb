SUMMARY = "Touch with mkdir tool"
DESCRIPTION = "Bonk is a touch alternative with an added feature to \
create directories."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "bonk-0.3.2-1.2.aarch64.rpm"
RPM_HASH = "fc12cd152149920d0771f2c798d500e1315dea436d24ce9057e52eb38eb82facc2906429bb2cf411dfaacb5b39598bcd3656d8ab54afa607ad8f8d74d29c355d"

RPROVIDES:${PN} += "bonk \
bundled-rust-crate-bonky"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
