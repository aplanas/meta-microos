SUMMARY = "Documentation for texlive-gustlib"
DESCRIPTION = "This package includes the documentation for texlive-gustlib"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54074"

RPM_NAME = "texlive-gustlib-doc-2023.201.svn54074-53.2.noarch.rpm"
RPM_HASH = "1261695e0087ad5b031fda0cb1075e6170469f9d61b48eec36a607b32a82e356719ceaee379a64a4deffc1eca34400489786dcc4b805d56f0cbb7f4f4d239a3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gustlib-doc"

RDEPENDS:${PN} += ""

inherit rpm
