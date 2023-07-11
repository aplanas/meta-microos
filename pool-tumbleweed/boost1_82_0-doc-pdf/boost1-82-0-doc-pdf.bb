SUMMARY = "PDF documentation for the Boost C++ Libraries"
DESCRIPTION = "This package contains the documentation of the boost dynamic libraries \
in PDF format."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost1_82_0-doc-pdf-1.82.0-1.2.noarch.rpm"
RPM_HASH = "740823a5c7a43ba46d0a2bc6437fb38ed59bfd11d1a48b746e22a917465c2cc2fcfa9131c40b253f20dd6d3fd194731a646c411a3971db145f19125d8f4d813b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost1-82-0-doc-pdf"

RDEPENDS:${PN} += ""

inherit rpm
