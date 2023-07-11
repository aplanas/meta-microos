SUMMARY = "Demonstration and samples for xalan-j2"
DESCRIPTION = "Xalan is an XSLT processor for transforming XML documents into HTML, \
text, or other XML document types. It implements the W3C \
Recommendations for XSL Transformations (XSLT) and the XML Path \
Language (XPath). It can be used from the command line, in an applet or \
a servlet, or as a module in other program. \
 \
This package contains demonstration and sample files for Xalan."
LICENSE = "Apache-2.0"

PV = "2.7.2"

RPM_NAME = "xalan-j2-demo-2.7.2-12.7.noarch.rpm"
RPM_HASH = "0035da33676ea356bea391ff8d7c275e2ef8bd81aab14a921454b37c3603dbfc3da5f45b85c8a2ccd0aeec38821c0227e758f2c54290ce2ad6accb358d0f0075"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xalan-j2-demo"

RDEPENDS:${PN} += "servlet \
xalan-j2"

inherit rpm
