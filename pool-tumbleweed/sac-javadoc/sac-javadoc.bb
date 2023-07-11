SUMMARY = "Javadoc for sac"
DESCRIPTION = "Javadoc for sac."
LICENSE = "W3C"

PV = "1.3"

RPM_NAME = "sac-javadoc-1.3-11.6.noarch.rpm"
RPM_HASH = "0a3697b9e6198ac365e5aae0e9832b824cc3ab95ea5664816bbbee4a4be350ac3ee41a7dbc1311ca4b9646439138c101804de178a9ac19871929f5afffcb03a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sac-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
