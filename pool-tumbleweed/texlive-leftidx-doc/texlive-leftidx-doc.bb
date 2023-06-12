SUMMARY = "Documentation for texlive-leftidx"
DESCRIPTION = "This package includes the documentation for texlive-leftidx"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-leftidx-doc-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "b87c0d9f95faffa9f0558d27d48bda267e78f079c57dc5436c6cb66ade12b452541e7b76929545c7cb1b0e32b9b47a459f2dd17f53f23228ad1a73739476eec3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-leftidx-doc"
RDEPENDS:${PN} += ""

inherit rpm
