SUMMARY = "Package provides recommended R-boot"
DESCRIPTION = "This packages provides R-boot, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "1.3.28"

RPM_NAME = "R-boot-1.3.28-45.2.aarch64.rpm"
RPM_HASH = "5fd065077587a08edfb91e4d237387c0883b4f2cb2356fe2d7cefa8e1d985994acefb27adb622c56749675e51a35e8d55c74ebcd03d0bea0096d193a3b28254b"

RPROVIDES:${PN} += "R-boot"

RDEPENDS:${PN} += "R-base"

inherit rpm
