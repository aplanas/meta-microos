SUMMARY = "Touch with mkdir tool"
DESCRIPTION = "Bonk is a touch alternative with an added feature to \
create directories."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "bonk-0.3.2-1.3.aarch64.rpm"
RPM_HASH = "c3780192e929d45b3de79d96e7b72aa1c9a5ebd3c7c7acd01c24cf586bdff2d2f8fd1e2bca10430bc04893d85204090acae2c1fb64b2de6fbee143ca0bcbe77c"

RPROVIDES:${PN} += "bonk \
bundled-rust-crate-bonky"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
