SUMMARY = "Javadoc for jsr-311"
DESCRIPTION = "This package contains javadoc for jsr-311."
LICENSE = "CDDL-1.0"

PV = "1.1.1"

RPM_NAME = "jsr-311-javadoc-1.1.1-3.10.noarch.rpm"
RPM_HASH = "ffc654127bf5bd36626128374cb8daf52e307420c6bee952fe374120fdd508b264451c2a0e99069ab0aec918fbd6752919c676863d7328bb830ffd3821c2f221"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsr-311-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
