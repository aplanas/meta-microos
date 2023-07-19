SUMMARY = "Documentation files for qpdf"
DESCRIPTION = "This package contains the documentation for qpdf"
LICENSE = "Apache-2.0"

PV = "11.5.0"

RPM_NAME = "qpdf-htmldoc-11.5.0-1.1.noarch.rpm"
RPM_HASH = "12dd1b2e229eabc7f942ddc5c8e52548825b26de10d7e1fdaedd19b09fce346d3dd0401a3f284a22ca77b76bd234401154e0ffaeeb0635937e545b4e3714a706"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qpdf-htmldoc"

RDEPENDS:${PN} += ""

inherit rpm
