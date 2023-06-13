SUMMARY = "A Report Generator"
DESCRIPTION = "Calamaris parses log files from Squid V1.1.x, V1.2.x, V2.x, and NetCache in \
native log format and generates a report."
LICENSE = "GPL-2.0-or-later"

PV = "2.59"

RPM_NAME = "calamaris-2.59-161.10.noarch.rpm"
RPM_HASH = "f90b2cd245b3e2fe7eda6426a58c71d7b62bcdb3735a7bb3e4f28a5840ba35ee138fd1aab70c381a8305bfa2a1c668b0b681ac1715e9ce7291d6ac4bfa2c14b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "calamaris"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
