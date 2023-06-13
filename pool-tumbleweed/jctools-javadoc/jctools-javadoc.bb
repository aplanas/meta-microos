SUMMARY = "Javadoc for jctools"
DESCRIPTION = "This package contains javadoc for jctools."
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "jctools-javadoc-3.3.0-2.10.noarch.rpm"
RPM_HASH = "b586dfca2094d9875dc6809524b2bec7bdaf17f3aaaa0d450f173b43d02148f0c7185105c15c88034805399b3f38a75be29e2512b339506eee8f070ec64afda6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jctools-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
