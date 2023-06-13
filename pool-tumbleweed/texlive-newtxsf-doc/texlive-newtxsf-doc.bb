SUMMARY = "Documentation for texlive-newtxsf"
DESCRIPTION = "This package includes the documentation for texlive-newtxsf"
LICENSE = "OFL-1.1"

PV = "2023.201.1.054svn59227"

RPM_NAME = "texlive-newtxsf-doc-2023.201.1.054svn59227-54.1.noarch.rpm"
RPM_HASH = "20fe40c302e84ec4719d8428670aaa430117647fd80d1aedadcba7cdc695c3b078a6ae0e7e7e0cc856843b247bf85bb58c35a904c947d5c0ca368f91739c4d6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newtxsf-doc"

RDEPENDS:${PN} += ""

inherit rpm
