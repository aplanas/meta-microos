SUMMARY = "Documentation for texlive-ppr-prv"
DESCRIPTION = "This package includes the documentation for texlive-ppr-prv"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.13csvn15878"

RPM_NAME = "texlive-ppr-prv-doc-2023.201.0.0.13csvn15878-52.1.noarch.rpm"
RPM_HASH = "8e7bac1d134a2f0e618a0db1d54a9c771cc8a1005bbae0a507e656a447ed003ae9bf0b9677813a5d73fe2e0fa7a6eeb67ba992c37727ab725e009996625e9b6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ppr-prv-doc"

RDEPENDS:${PN} += ""

inherit rpm
