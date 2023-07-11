SUMMARY = "Documentation for texlive-eiad-ltx"
DESCRIPTION = "This package includes the documentation for texlive-eiad-ltx"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-eiad-ltx-doc-2023.201.1.0svn15878-53.2.noarch.rpm"
RPM_HASH = "946560a558a85715e45b2aaffc1978379f0222da61c4822eafe50e6897ec3e98ac445879b6187704b0037a7c035221325a20f9f5740b021f64a7b6c5fc6ba065"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eiad-ltx-doc"

RDEPENDS:${PN} += ""

inherit rpm
