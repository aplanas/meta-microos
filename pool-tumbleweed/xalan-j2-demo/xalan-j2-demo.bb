SUMMARY = "Demonstration and samples for xalan-j2"
DESCRIPTION = "Xalan is an XSLT processor for transforming XML documents into HTML, \
text, or other XML document types. It implements the W3C \
Recommendations for XSL Transformations (XSLT) and the XML Path \
Language (XPath). It can be used from the command line, in an applet or \
a servlet, or as a module in other program. \
 \
This package contains demonstration and sample files for Xalan."
LICENSE = "Apache-2.0"

PV = "2.7.3"

RPM_NAME = "xalan-j2-demo-2.7.3-1.1.noarch.rpm"
RPM_HASH = "01f111e9ce38421c69a3fdf1daabc529da1bcb7b88b1282571e843ab562e6a98a7d9e4b0f4306eae1fa8c65b86e45511178b5630684fc9dd0213e9d01b2d4bff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xalan-j2-demo"

RDEPENDS:${PN} += "servlet \
xalan-j2"

inherit rpm
