SUMMARY = "Documentation for texlive-dialogl"
DESCRIPTION = "This package includes the documentation for texlive-dialogl"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn28946"

RPM_NAME = "texlive-dialogl-doc-2023.201.svn28946-52.1.noarch.rpm"
RPM_HASH = "15bf3876a4df5cee345ccab7f3eac3c6db6b38b32c60f611896a94449f42edf4dbfec374eb123597feebefec2901d7b68948d4e8967c5aa59996e590dbf12649"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dialogl-doc"

RDEPENDS:${PN} += ""

inherit rpm
