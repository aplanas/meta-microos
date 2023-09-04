SUMMARY = "HTML syntax checker and pretty printer"
DESCRIPTION = "JTidy is a Java port of HTML Tidy, a HTML syntax checker and pretty \
printer. Like its non-Java cousin, JTidy can be used as a tool for \
cleaning up malformed and faulty HTML. In addition, JTidy provides a \
DOM parser for real-world HTML."
LICENSE = "BSD-3-Clause"

PV = "1.0.4"

RPM_NAME = "jtidy-javadoc-1.0.4-1.1.noarch.rpm"
RPM_HASH = "8426f9c2cf07dbc5a786b33008e99712fb7dcc24902b0b104a57ebacac1dd1974409a578f299014c72a0aa55eac85928327b9f9e5f94a2d520ff24a166ab7c93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jtidy-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
