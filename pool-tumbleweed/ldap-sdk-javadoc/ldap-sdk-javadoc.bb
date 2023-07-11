SUMMARY = "Javadoc for ldap-sdk"
DESCRIPTION = "Javadoc for ldap-sdk"
LICENSE = "GPL-2.0-or-later | MPL-1.1 | LGPL-2.0-or-later"

PV = "4.21.0"

RPM_NAME = "ldap-sdk-javadoc-4.21.0-2.7.noarch.rpm"
RPM_HASH = "fc498802f28e62ef80db1036049d633bd32338f112ab0bc85c8461c88476536d862df7131c5e438fee4b680d7bf3637fff8815dee6208792646c59b5aead3377"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ldap-sdk-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
