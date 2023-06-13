SUMMARY = "Documentation for texlive-musuos"
DESCRIPTION = "This package includes the documentation for texlive-musuos"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1dsvn24857"

RPM_NAME = "texlive-musuos-doc-2023.201.1.1dsvn24857-54.1.noarch.rpm"
RPM_HASH = "31d92360fb8a51ef5feed0266f23bfad4a56ecba6c5f856b7b02154f83e3f8873d8ccc4203fa32a189e48f3236895b9cf2e669d8b4811e86df98dd86082558a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-musuos-doc"

RDEPENDS:${PN} += ""

inherit rpm
