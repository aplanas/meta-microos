SUMMARY = "Javadoc for werken-xpath"
DESCRIPTION = "werken.xpath is an implementation of the W3C XPath Recommendation, on \
top of the JDOM library.  It takes as input a XPath expression, and a \
JDOM tree, and returns a NodeSet (java.util.List) of selected \
elements.  Is is being used in the development of the \
as-yet-unreleased werken.xslt (eXtensible Stylesheet Language) and the \
werken.canonical (XML canonicalization) packages."
LICENSE = "Apache-1.1"

PV = "0.9.4"

RPM_NAME = "werken-xpath-javadoc-0.9.4-28.7.noarch.rpm"
RPM_HASH = "6a5d90a62955b7dd443941f702fb1a27280b5482e3adab77663a0f7d213dcf7e7d6f3fee17426f0b5abfb82e0c232e1cbed4ab403ad46c503af6e1f8546b82e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "werken-xpath-javadoc \
werken.xpath-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
