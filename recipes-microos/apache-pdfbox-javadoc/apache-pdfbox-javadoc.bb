SUMMARY = "API Documentation for PDFBox"
DESCRIPTION = "JavaDoc documentation for apache-pdfbox"
LICENSE = "Apache-2.0 & OFL-1.1"

PV = "2.0.28"

RPM_NAME = "apache-pdfbox-javadoc-2.0.28-1.1.noarch.rpm"
RPM_HASH = "8ba4555c981f609293620622c0b2a76c46f81f9ab36a3daaf459825be3f3a6887e6ce3e8a581daf4e2c7193e4fd939c8052a5b561c8fb58477dab440edaa7aab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-pdfbox-javadoc"
RDEPENDS:${PN} += "apache-pdfbox \
javapackages-filesystem"

inherit rpm
