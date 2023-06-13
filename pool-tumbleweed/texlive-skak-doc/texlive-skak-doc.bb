SUMMARY = "Documentation for texlive-skak"
DESCRIPTION = "This package includes the documentation for texlive-skak"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5.3svn61719"

RPM_NAME = "texlive-skak-doc-2023.201.1.5.3svn61719-57.1.noarch.rpm"
RPM_HASH = "9812f173b117929c8609f602ed128202736f0f3486adb97b02ae3bc2c11632bfa077db459306f8de49926d6fb9e7bd886765e18112fa270f0fa02ca8d2a8b35e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-skak-doc"

RDEPENDS:${PN} += ""

inherit rpm
