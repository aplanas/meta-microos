SUMMARY = "Documentation for texlive-kotex-plain"
DESCRIPTION = "This package includes the documentation for texlive-kotex-plain"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0.0svn63689"

RPM_NAME = "texlive-kotex-plain-doc-2023.201.3.0.0svn63689-55.1.noarch.rpm"
RPM_HASH = "0a9f573386bd9f628a856c87cbe120751347dec11a69ab9dfed0acea71adc1af4fdf31340be839a871bad4807f720c10488e72b72fbf3faa6cfc6fc1fc13c9ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kotex-plain-doc"
RDEPENDS:${PN} += ""

inherit rpm
