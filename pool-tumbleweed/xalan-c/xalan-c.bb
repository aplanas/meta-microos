SUMMARY = "An XSLT Transformation Engine in C++"
DESCRIPTION = "Xalan is an XSL processor for transforming XML documents into HTML, \
text, or other XML document types. Xalan-C++ represents an almost \
complete and robust C++ reference implementation of the W3C \
Recommendations for XSL Transformations (XSLT) and the XML Path \
Language (XPath)."
LICENSE = "Apache-2.0"

PV = "1.12"

RPM_NAME = "xalan-c-1.12-1.11.aarch64.rpm"
RPM_HASH = "01cf0f216d11cb0634aa92b38fba1bbf7f44c05937fd34e8733cd15a983090ea693ab686432cdd200ed01e85da63c4c65c067b99749dd96d150e7eae9ef41055"

RPROVIDES:${PN} += "Xalan-C \
xalan-c"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxalan-c.so.112 \
libxerces-c-3.2.so"

inherit rpm
