SUMMARY = "Documentation for texlive-microtype"
DESCRIPTION = "This package includes the documentation for texlive-microtype"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1asvn66587"

RPM_NAME = "texlive-microtype-doc-2023.209.3.1asvn66587-55.1.noarch.rpm"
RPM_HASH = "f93a725ce1b3ae84fb2cf77a95ac2755a0cea8d81b0858021a9ab6cf1e2ebddbaed0d2317b819f31be558aecb11d8d30e588a82d59bf7c0cc52cb7819d96489a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-microtype-doc"

RDEPENDS:${PN} += ""

inherit rpm
