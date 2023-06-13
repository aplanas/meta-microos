SUMMARY = "Manual for xalan-j2"
DESCRIPTION = "Xalan is an XSLT processor for transforming XML documents into HTML, \
text, or other XML document types. It implements the W3C \
Recommendations for XSL Transformations (XSLT) and the XML Path \
Language (XPath). It can be used from the command line, in an applet or \
a servlet, or as a module in other program. \
 \
This package contains the manual for Xalan."
LICENSE = "Apache-2.0"

PV = "2.7.2"

RPM_NAME = "xalan-j2-manual-2.7.2-12.6.noarch.rpm"
RPM_HASH = "c3e3322c2853e71db4606e49777af5329e91a210c9b43d6af3c13b6e120dd83d3f748fa154e08de783a5641af46e5e7e72c0ffec00c27e0cf30822ef4ee6a911"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xalan-j2-manual"

RDEPENDS:${PN} += ""

inherit rpm
