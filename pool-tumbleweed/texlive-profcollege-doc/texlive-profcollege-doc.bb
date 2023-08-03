SUMMARY = "Documentation for texlive-profcollege"
DESCRIPTION = "This package includes the documentation for texlive-profcollege"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.99_z_fsvn66364"

RPM_NAME = "texlive-profcollege-doc-2023.209.0.0.99_z_fsvn66364-53.1.noarch.rpm"
RPM_HASH = "0bdfcf7e949d529783c2c7f46368009fe2c9c226697a58f129eace598bb9ca6547f4994acce38d5a98ee65031e3cfc8bb9d4a3535afdf29882bd7e65d5c44395"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-profcollege-doc-fr \
texlive-profcollege-doc"

RDEPENDS:${PN} += ""

inherit rpm
