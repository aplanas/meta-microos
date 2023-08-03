SUMMARY = "Miscellaneous user tools writen in Qore Programming Language"
DESCRIPTION = "This package contains tool for working with: \
 - REST APIs \
 - SQL Databases"
LICENSE = "GPL-2.0-or-later | LGPL-2.0-or-later | MIT"

PV = "1.16.1"

RPM_NAME = "qore-misc-tools-1.16.1-1.1.noarch.rpm"
RPM_HASH = "d4cbc2bb07adcd33854dc01e6648ee605adfa6965b7cf11aad37b09ab11c30b1b0bcaf4dfa599008aeda789ad619317f4e27a8dea334c747ac2db91fed0cdb07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qore-misc-tools"

RDEPENDS:${PN} += "qore"

inherit rpm
