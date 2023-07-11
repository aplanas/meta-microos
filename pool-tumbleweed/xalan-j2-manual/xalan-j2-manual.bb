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

RPM_NAME = "xalan-j2-manual-2.7.2-12.7.noarch.rpm"
RPM_HASH = "0829a708eff38a10a2eb983b0e90fe4b7664071bea4665a48bba63962995eebf272eb1e4b55a35d8a3091174f7b7bb8dc64b8e0f07d2d487f6fb9bcf29135012"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xalan-j2-manual"

RDEPENDS:${PN} += ""

inherit rpm
