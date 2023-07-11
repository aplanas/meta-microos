SUMMARY = "Javadoc for librepository"
DESCRIPTION = "Javadoc for librepository."
LICENSE = "LGPL-2.0-only"

PV = "1.1.6"

RPM_NAME = "librepository-javadoc-1.1.6-1.5.noarch.rpm"
RPM_HASH = "08a2a7195ac0b99a67fa6cd0ea4b246533de659083a586fd2842f2f763ac7798a0f9f4badfc1abf259bb43f25a68d13608f8bac8402028be6004df9e57740f05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "librepository-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
