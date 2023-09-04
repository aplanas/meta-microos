SUMMARY = "API Documentation for PDFBox"
DESCRIPTION = "JavaDoc documentation for apache-pdfbox"
LICENSE = "Apache-2.0 & OFL-1.1"

PV = "2.0.29"

RPM_NAME = "apache-pdfbox-javadoc-2.0.29-1.1.noarch.rpm"
RPM_HASH = "ca078c7190e61d6b4213ceee892b911770685dc4b32d1bbf3d466a88d12b83d8b9e6c97f142517eac3db781917f040e389360cc3971706846c625f47a56bb3bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-pdfbox-javadoc"

RDEPENDS:${PN} += "apache-pdfbox \
javapackages-filesystem"

inherit rpm
