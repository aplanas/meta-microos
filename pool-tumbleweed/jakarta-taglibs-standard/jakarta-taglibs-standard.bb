SUMMARY = "Open Source Implementation of the JSP Standard Tag Library"
DESCRIPTION = "This package contains releases for the 1.1.x versions of the Standard \
Tag Library, Jakarta Taglibs's open source implementation of the JSP \
Standard Tag Library (JSTL), version 1.1. JSTL is a standard under the \
Java Community Process."
LICENSE = "Apache-2.0"

PV = "1.1.2"

RPM_NAME = "jakarta-taglibs-standard-1.1.2-2.7.noarch.rpm"
RPM_HASH = "184d910c697a2a7b98cef712a0313c55a4004fb80c64667f6edde7d125195dff3ddd44f6eb333d76a0d60e0210b0f64302e5308a63fc4416dd4e6b58b0a84775"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-taglibs-standard"

RDEPENDS:${PN} += "servletapi5 \
xalan-j2"

inherit rpm
