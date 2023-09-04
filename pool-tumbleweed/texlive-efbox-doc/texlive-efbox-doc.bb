SUMMARY = "Documentation for texlive-efbox"
DESCRIPTION = "This package includes the documentation for texlive-efbox"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn33236"

RPM_NAME = "texlive-efbox-doc-2023.209.1.0svn33236-54.2.noarch.rpm"
RPM_HASH = "f68e95dce736c6781f6905a30b5a83c8e0a838393602db5ffe1b6acde7bfd4e3af2494a033a3a92f9e85504aa1cff456051d61795d40f7ffe8cbeb6982a97966"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-efbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
