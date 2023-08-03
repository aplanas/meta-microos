SUMMARY = "Documentation for texlive-tablefootnote"
DESCRIPTION = "This package includes the documentation for texlive-tablefootnote"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1csvn32804"

RPM_NAME = "texlive-tablefootnote-doc-2023.209.1.1csvn32804-58.1.noarch.rpm"
RPM_HASH = "0cbb740f9a689fc1c468d4e5b366a7fa7b25893e9f700971a74c12d82cf7b1f737035473d587bbbd44f31a59c625b52b32f0ce139e53d99f8491cd21743f37ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tablefootnote-doc"

RDEPENDS:${PN} += ""

inherit rpm
