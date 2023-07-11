SUMMARY = "API Documentation for PDFBox"
DESCRIPTION = "JavaDoc documentation for apache-pdfbox"
LICENSE = "Apache-2.0 & OFL-1.1"

PV = "2.0.28"

RPM_NAME = "apache-pdfbox-javadoc-2.0.28-1.2.noarch.rpm"
RPM_HASH = "7640cc34864cec81fb28c7dbc43269d89fb8d510707867c0dffe34649dd2f240a0686bc5a1ed05a81bc5bc9db5f999058ae79466a71532578b69d6b9e249cae4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-pdfbox-javadoc"

RDEPENDS:${PN} += "apache-pdfbox \
javapackages-filesystem"

inherit rpm
