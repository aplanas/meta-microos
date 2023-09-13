SUMMARY = "Javadoc for stax-ex"
DESCRIPTION = "This package contains javadoc for stax-ex."
LICENSE = "CDDL-1.0 | GPL-2.0-only"

PV = "1.8"

RPM_NAME = "stax-ex-javadoc-1.8-5.1.noarch.rpm"
RPM_HASH = "1067e924f0b96ae5475a9444508dbde10ace2f694944b44884033903a2747a715c6ec8f21897e6709fac8facb271d11e2fe43bced38d5135ba74a2522bf28446"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "stax-ex-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
