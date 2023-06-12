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

RPM_NAME = "itextpdf-5.5.13.3-1.10.noarch.rpm"
RPM_HASH = "46ec013d9a436f7d10e3ecb90491bf41a5053d6e124aeb2108c4ebc26034f92b0df49f119330bcc1475e162d80b6abf0814000a3d6482a4d2166c4e52413198d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "itextpdf \
mvn(com.itextpdf.tool:xmlworker) \
mvn(com.itextpdf.tool:xmlworker:pom:) \
mvn(com.itextpdf:itext-pdfa) \
mvn(com.itextpdf:itext-pdfa:pom:) \
mvn(com.itextpdf:itext-xtra) \
mvn(com.itextpdf:itext-xtra:pom:) \
mvn(com.itextpdf:itextpdf) \
mvn(com.itextpdf:itextpdf:pom:) \
mvn(com.itextpdf:root:pom:) \
osgi(com.itextpdf) \
osgi(com.itextpdf.tool.xmlworker)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(commons-io:commons-io) \
mvn(org.apache.commons:commons-imaging)"

inherit rpm
