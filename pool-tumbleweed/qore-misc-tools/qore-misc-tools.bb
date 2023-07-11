SUMMARY = "Miscellaneous user tools writen in Qore Programming Language"
DESCRIPTION = "This package contains tool for working with: \
 - REST APIs \
 - SQL Databases"
LICENSE = "GPL-2.0-or-later | LGPL-2.0-or-later | MIT"

PV = "1.13.0"

RPM_NAME = "qore-misc-tools-1.13.0-1.6.noarch.rpm"
RPM_HASH = "999090079ab1f2e70fe274aeb8f87a3a7ac6363bbbfd780b74c7c97def2fd626fc52492a3ad4508c531cf4a56baaed6aeb768a79f8db62e8517901892c4ce327"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qore-misc-tools"

RDEPENDS:${PN} += "qore"

inherit rpm
