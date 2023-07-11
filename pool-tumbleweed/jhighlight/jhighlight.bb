SUMMARY = "An embeddable pure Java syntax highlighting library"
DESCRIPTION = "JHighlight is an embeddable pure Java syntax highlighting library that supports \
Java, Groovy, C++, HTML, XHTML, XML and LZX languages and outputs to XHTML. It \
also supports RIFE (http://rifers.org) templates tags and highlights them \
clearly so that you can easily identify the difference between your RIFE markup \
and the actual marked up source."
LICENSE = "CDDL-1.0 | LGPL-2.1-or-later"

PV = "1.0.1"

RPM_NAME = "jhighlight-1.0.1-2.11.noarch.rpm"
RPM_HASH = "33d4fdc9288e841b481f68ff7109ca7723ec0d887233579322a81db73b8f41611e02192af7b72ec31a7481511c91a9849b890b5b01426e90ecc331c77212f03a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jhighlight \
mvn-com.uwyn-jhighlight \
mvn-com.uwyn-jhighlight-pom- \
mvn-org.codelibs-jhighlight \
mvn-org.codelibs-jhighlight-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
