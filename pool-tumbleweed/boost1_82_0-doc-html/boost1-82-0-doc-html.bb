SUMMARY = "HTML documentation for the Boost C++ Libraries"
DESCRIPTION = "This package contains the documentation of the boost dynamic libraries \
in HTML format."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost1_82_0-doc-html-1.82.0-1.2.noarch.rpm"
RPM_HASH = "64b12396137227bd4188d64c801a833ff5cc5707d2b86afbf5eb00f9e45188f59bb823976d3e3f5cdb1c91361b83dbc54717f9bdb0e1148102f124256f89954e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost1-82-0-doc-html"

RDEPENDS:${PN} += ""

inherit rpm
