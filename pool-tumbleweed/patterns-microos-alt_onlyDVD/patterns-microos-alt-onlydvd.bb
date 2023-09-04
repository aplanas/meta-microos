SUMMARY = "Alternative Packages only for the DVD of openSUSE MicroOS"
DESCRIPTION = "Alternative additional packages on a openSUSE MicroOS DVD."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-alt_onlyDVD-5.0-73.1.aarch64.rpm"
RPM_HASH = "029f963a1ee2e52936de35aed50b1110a252a12cb8e3ff2f2e64d976a3c8dffd52fc212c57c4311f32c5de17e2fffe188c748be393d483c32050eb38516e6e3b"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
patterns-microos-alt-onlyDVD"

RDEPENDS:${PN} += "kernel-default-base \
pattern-"

inherit rpm
