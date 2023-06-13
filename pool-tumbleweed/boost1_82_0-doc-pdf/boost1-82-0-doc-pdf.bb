SUMMARY = "PDF documentation for the Boost C++ Libraries"
DESCRIPTION = "This package contains the documentation of the boost dynamic libraries \
in PDF format."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost1_82_0-doc-pdf-1.82.0-1.1.noarch.rpm"
RPM_HASH = "14fdfd539e51fc51cc26d10abbcbed2b038ee092caa611777a07b279f05c2b8859112bab1e85751a526028a557fba9ebfe403d41324f93ef0940474875a4f182"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost1_82_0-doc-pdf"

RDEPENDS:${PN} += ""

inherit rpm
