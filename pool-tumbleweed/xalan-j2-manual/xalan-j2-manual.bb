SUMMARY = "Manual for xalan-j2"
DESCRIPTION = "Xalan is an XSLT processor for transforming XML documents into HTML, \
text, or other XML document types. It implements the W3C \
Recommendations for XSL Transformations (XSLT) and the XML Path \
Language (XPath). It can be used from the command line, in an applet or \
a servlet, or as a module in other program. \
 \
This package contains the manual for Xalan."
LICENSE = "Apache-2.0"

PV = "2.7.3"

RPM_NAME = "xalan-j2-manual-2.7.3-1.1.noarch.rpm"
RPM_HASH = "3916227220a9fc5dc2c8c7a05b7045106813ba0e5251951beec3bc8e595d7d845e3c96b7afdab992f45601dff2a6fc93884dc3f59b22f1e9fab40cf5ff37edb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xalan-j2-manual"

RDEPENDS:${PN} += ""

inherit rpm
