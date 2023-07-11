SUMMARY = "Shared directories between PowerDNS Packages"
DESCRIPTION = "Shared directories between PowerDNS Packages"
LICENSE = "MIT"

PV = "4.0"

RPM_NAME = "pdns-common-4.0-3.4.noarch.rpm"
RPM_HASH = "fff196ee524a1d012a0adbdffe6f7a8ff84e3b940915e3acfb7f5375486f95d2cdffbfe77a340d1b785bb994d97f86fc2a87b6f1dc3a836d99dfcdbd59b9238b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-pdns \
pdns-common \
user-pdns"

RDEPENDS:${PN} += "/usr/bin/sh \
shadow \
sysuser-shadow"

inherit rpm
