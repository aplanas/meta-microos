SUMMARY = "Terminal JSON viewer"
DESCRIPTION = "Terminal JSON viewer."
LICENSE = "MIT"

PV = "24.1.0"

RPM_NAME = "fx-24.1.0-1.2.aarch64.rpm"
RPM_HASH = "4a1db9f208408c03411fffef1739d78e449a89d87231fffb182366bfebc38b1491ba495928e253901d03c17824b74f073deec3523360e695a904f4c429bd4ff2"

RPROVIDES:${PN} += "fx"

RDEPENDS:${PN} += ""

inherit rpm
