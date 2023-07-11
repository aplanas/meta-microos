SUMMARY = "An XSLT Transformation Engine in C++ - Development Files"
DESCRIPTION = "Xalan is an XSL processor for transforming XML documents into HTML, \
text, or other XML document types. Xalan-C++ represents an almost \
complete and a robust C++ reference implementation of the W3C \
Recommendations for XSL Transformations (XSLT) and the XML Path \
Language (XPath). \
 \
This package contains files needed for development with Xalanc"
LICENSE = "Apache-2.0"

PV = "1.12"

RPM_NAME = "libxalan-c-devel-1.12-1.12.aarch64.rpm"
RPM_HASH = "3b728828ea92e8c3d4f1dfc6ecca7b238130a64e952c898c9a64acf33e996aa963ec36994f1571dd6b86a96bf6a45084c4fdb006b6bb4fdcd77e369ef6e03357"

RPROVIDES:${PN} += "Xalan-c-devel \
cmake-XalanC \
libXalan-c-devel \
libxalan-c-devel \
pkgconfig-xalan-c"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxalan-c112"

inherit rpm
