SUMMARY = "Documentation for texlive-booklet"
DESCRIPTION = "This package includes the documentation for texlive-booklet"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7bsvn15878"

RPM_NAME = "texlive-booklet-doc-2023.201.0.0.7bsvn15878-52.1.noarch.rpm"
RPM_HASH = "0172d668ebf6d4af07f1a163289d24e212b349ac87c9d12bcbf6e9ad76e7b5abab5fd94113875290493c894ff6aed469e3402483be38311e6eb26c7550c3fab1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-booklet-doc"
RDEPENDS:${PN} += ""

inherit rpm
