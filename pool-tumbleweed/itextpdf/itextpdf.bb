SUMMARY = "A Free Java-PDF library"
DESCRIPTION = "iText is a library that allows you to generate PDF files on the fly. \
The iText classes are very useful for people who need to generate \
read-only, platform independent documents containing text, lists, \
tables and images. The library is especially useful in combination with \
Java(TM) technology-based Servlets: The look and feel of HTML is \
browser dependent; with iText and PDF you can control exactly how your \
servlet's output will look."
LICENSE = "AGPL-3.0-only"

PV = "5.5.13.3"

RPM_NAME = "itextpdf-5.5.13.3-1.11.noarch.rpm"
RPM_HASH = "ec50b9b58e15ea84a8426ccbfa78d15758880dcf7c5dbeddae0672444e633558d44dfcd67f59ca1b1339913d94a18d4615d46b7a3820fbab9db91ccead2462f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "itextpdf \
mvn-com.itextpdf-itext-pdfa \
mvn-com.itextpdf-itext-pdfa-pom- \
mvn-com.itextpdf-itext-xtra \
mvn-com.itextpdf-itext-xtra-pom- \
mvn-com.itextpdf-itextpdf \
mvn-com.itextpdf-itextpdf-pom- \
mvn-com.itextpdf-root-pom- \
mvn-com.itextpdf.tool-xmlworker \
mvn-com.itextpdf.tool-xmlworker-pom- \
osgi-com.itextpdf \
osgi-com.itextpdf.tool.xmlworker"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-org.apache.commons-commons-imaging"

inherit rpm
