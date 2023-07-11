SUMMARY = "Javadoc for gmavenplus-plugin"
DESCRIPTION = "This package contains javadoc for gmavenplus-plugin."
LICENSE = "Apache-2.0"

PV = "1.13.1"

RPM_NAME = "gmavenplus-plugin-javadoc-1.13.1-1.15.noarch.rpm"
RPM_HASH = "6c2aac912513c37abfb3482dab6e0fffed14e11daf8996ec54cfd34576c83d33d5ced0476ffb123f0425c6baa5d7eab4c7ffaa36f23ef7c51e8be5a73125c728"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gmavenplus-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
