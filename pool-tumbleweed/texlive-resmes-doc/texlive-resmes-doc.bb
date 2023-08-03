SUMMARY = "Documentation for texlive-resmes"
DESCRIPTION = "This package includes the documentation for texlive-resmes"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn65375"

RPM_NAME = "texlive-resmes-doc-2023.209.1.0svn65375-54.1.noarch.rpm"
RPM_HASH = "69ba30870cc3e39d23f7faf3ad481b97aa6f58c9b1eff84c595fb7926fb9940454b3bd0a4069310fc183fbb01a91592d48039bfbfad50043ccdccc09ca5e76ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-resmes-doc"

RDEPENDS:${PN} += ""

inherit rpm
