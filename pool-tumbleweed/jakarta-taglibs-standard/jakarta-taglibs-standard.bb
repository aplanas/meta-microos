SUMMARY = "Open Source Implementation of the JSP Standard Tag Library"
DESCRIPTION = "This package contains releases for the 1.1.x versions of the Standard \
Tag Library, Jakarta Taglibs's open source implementation of the JSP \
Standard Tag Library (JSTL), version 1.1. JSTL is a standard under the \
Java Community Process."
LICENSE = "Apache-2.0"

PV = "1.1.2"

RPM_NAME = "jakarta-taglibs-standard-1.1.2-2.6.noarch.rpm"
RPM_HASH = "4d7def67219266c127b689c8344ae2d4531d098f5100604b86f2ff08dc9e51b1a07ee48c1d68fd152d0c36641c81e695a519865992eca07698ba65095b916557"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-taglibs-standard"
RDEPENDS:${PN} += "servletapi5 \
xalan-j2"

inherit rpm
