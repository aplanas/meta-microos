SUMMARY = "Documentation for texlive-lxfonts"
DESCRIPTION = "This package includes the documentation for texlive-lxfonts"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0bsvn32354"

RPM_NAME = "texlive-lxfonts-doc-2023.201.2.0bsvn32354-52.1.noarch.rpm"
RPM_HASH = "69323f877964b3cbc50e34f65f52136b480657881fd1fa9f159d21cca2efe0d678695464604e8611165e6608d5eb9a6cea05cd9b32f2113422850f0f6b52e039"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lxfonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
