SUMMARY = "Documentation for texlive-lineara"
DESCRIPTION = "This package includes the documentation for texlive-lineara"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn63169"

RPM_NAME = "texlive-lineara-doc-2023.209.svn63169-55.1.noarch.rpm"
RPM_HASH = "a512aee6fe661079cbcc2af22057a52dcec6fcd94b52e803a10c6d8026f7da72065f579d53d9c31060893b614d28f07cb4528d9da8be54d6c515f58b1aeb32db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lineara-doc"

RDEPENDS:${PN} += ""

inherit rpm
