SUMMARY = "Documentation for texlive-skdoc"
DESCRIPTION = "This package includes the documentation for texlive-skdoc"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5dsvn56950"

RPM_NAME = "texlive-skdoc-doc-2023.209.1.5dsvn56950-58.1.noarch.rpm"
RPM_HASH = "c9a9b0e26288e0f99233966ae81e92def676c25c7f958452021e5269797280c8239bcf94d3d913d711147471d69e5e422964f73aa8ceb6fefb54f2be9d3d841d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-skdoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
