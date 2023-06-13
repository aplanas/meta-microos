SUMMARY = "HTML documentation for the Boost C++ Libraries"
DESCRIPTION = "This package contains the documentation of the boost dynamic libraries \
in HTML format."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost1_82_0-doc-html-1.82.0-1.1.noarch.rpm"
RPM_HASH = "bcf32c4c21a61da3cb32136028684f2c6b5b0a390116398f5728ac807a3f4e4728e6384a98642ac6ff741eb33d85bd7899661cfe4c0c2c866411268b2391039b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost1_82_0-doc-html"

RDEPENDS:${PN} += ""

inherit rpm
