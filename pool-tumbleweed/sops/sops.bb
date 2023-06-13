SUMMARY = "Simple and flexible tool for managing secrets"
DESCRIPTION = "Simple and flexible tool for managing secrets"
LICENSE = "MPL-2.0"

PV = "3.7.3"

RPM_NAME = "sops-3.7.3-1.6.aarch64.rpm"
RPM_HASH = "3e6fc3ca62e649227303629516e917a6eecf0fbc657ee88ba3f2dc1373150c9358685b7476fe84b9a9c74c8d97ae6eafe993e00505fcac3ba7a53ed81e456c6e"

RPROVIDES:${PN} += "sops \
sops(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
