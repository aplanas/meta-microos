SUMMARY = "Javadoc documentation for findbugs"
DESCRIPTION = "Javadoc documentation for findbugs."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.1"

RPM_NAME = "findbugs-javadoc-3.0.1-2.20.noarch.rpm"
RPM_HASH = "ed76527b2613e53b0aae749fdf4b498f7b0e7a113d552c14160bec149df14bd8725c3869683276658c2c91ebb894f36281be43cf6b55cb2b03c832448834aa52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "findbugs-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
