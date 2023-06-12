SUMMARY = "API documentation for jchardet"
DESCRIPTION = "API documentation for jchardet."
LICENSE = "GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later"

PV = "1.1"

RPM_NAME = "jchardet-javadoc-1.1-2.6.noarch.rpm"
RPM_HASH = "c09c8be46e245b452f8d611e8522c91adaa6d5957c2db0c38478e038bb6056c08eeb176b71ea94b55a0c80c11ffe10897c7fc908a5f67f4cd18203cbc39cdbd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jchardet-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
