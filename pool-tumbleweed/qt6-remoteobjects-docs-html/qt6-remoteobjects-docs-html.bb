SUMMARY = "Documentation for qt6-remoteobjects in HTML format"
DESCRIPTION = "This package contains documentation for qt6-remoteobjects in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-remoteobjects-docs-html-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "05231073280b896d6bab938cdefe535ddce6f19d4203732b61d1b053377299cc7600755f2184b7b7b04c7cf1307cd160589de83e74eac622ea0b19c7fa323e1d"

RPROVIDES:${PN} += "qt6-remoteobjects-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
