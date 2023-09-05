SUMMARY = "Development files for krdc"
DESCRIPTION = "Development libraries and headers needed to build software using krdc"
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "krdc-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "bb28500059c91ba1dbeb7934c03b25532fe8e7fb64022af3383a3cbf5713474d8755a5299aa8a0d5b06ff8202982cb03af2bf390ed421061aaae46e48ebd95e7"

RPROVIDES:${PN} += "krdc-devel"

RDEPENDS:${PN} += "krdc"

inherit rpm
