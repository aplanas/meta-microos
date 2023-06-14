SUMMARY = "iText Parent POM"
DESCRIPTION = "The Parent POM for iText Projects."
LICENSE = "AGPL-3.0-only"

PV = "1.0.0"

RPM_NAME = "itext-parent-1.0.0-1.10.noarch.rpm"
RPM_HASH = "2e4671e3b6174b1da587d3fa49106dc320f2ee262f0ee7a8162fd66804a70739ffb5c61a25aebcb8f36e4640c5c10f0cf26b7ccc82c5c947117e12d5116b64ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "itext-parent \
mvn-com.itextpdf-itext-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
