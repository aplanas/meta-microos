SUMMARY = "Documentation for adcli"
DESCRIPTION = "A command line tool that can perform actions in an Active Directory domain. \
Among other things it can be used to join a computer to a domain. \
 \
This package contains the documentation for adcli."
LICENSE = "LGPL-2.0-or-later"

PV = "0.9.2"

RPM_NAME = "adcli-doc-0.9.2-1.3.noarch.rpm"
RPM_HASH = "82b05ffcc3b929a8361f264975dbca25b0e4067d627ea5fde540a3d37b8fcaee4e6dd1f34068393f5fe1aef9308a934e943d336fe536c3b2930c881c5d597bd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adcli-doc"
RDEPENDS:${PN} += ""

inherit rpm
