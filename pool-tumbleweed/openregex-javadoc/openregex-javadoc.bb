SUMMARY = "Javadoc for openregex"
DESCRIPTION = "This package contains javadoc for openregex."
LICENSE = "LGPL-3.0-only"

PV = "1.1.1"

RPM_NAME = "openregex-javadoc-1.1.1-3.13.noarch.rpm"
RPM_HASH = "8da30b44e63e6d1aee97aeddb7ddf0f8961d8706ab661ab59433a123182fffc437af62c38e92935b00471c208ec8f11ebdf0dacfefdabfaf788cf2f525331c68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openregex-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
