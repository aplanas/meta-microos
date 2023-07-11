SUMMARY = "XPath implementation using JDOM"
DESCRIPTION = "werken.xpath is an implementation of the W3C XPath Recommendation, on \
top of the JDOM library.  It takes as input a XPath expression, and a \
JDOM tree, and returns a NodeSet (java.util.List) of selected \
elements.  Is is being used in the development of the \
as-yet-unreleased werken.xslt (eXtensible Stylesheet Language) and the \
werken.canonical (XML canonicalization) packages."
LICENSE = "Apache-1.1"

PV = "0.9.4"

RPM_NAME = "werken-xpath-0.9.4-28.7.noarch.rpm"
RPM_HASH = "9c939e5e7025360dab7dae0486eb9287fbcc130493bb1eba7d9954e1ac55d01025971da28607f13d073d393766714f91298563ff922183826a277675e164ddac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-werken-xpath-werken-xpath \
mvn-werken-xpath-werken-xpath-pom- \
werken-xpath \
werken.xpath"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
jdom"

inherit rpm
