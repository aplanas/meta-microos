SUMMARY = "Javadocs for jna"
DESCRIPTION = "This package contains the javadocs for jna."
LICENSE = "Apache-2.0 | LGPL-2.1-or-later"

PV = "5.5.0"

RPM_NAME = "jna-javadoc-5.5.0-3.6.noarch.rpm"
RPM_HASH = "7eb82cf24a0c197fa9078b8ac97d4476c27f0eb125291a7679e0988403c87238aa3a03ba6b7fd75a0a4fadc53a73218c41e482103bf05b3c3530956643501728"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jna-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
