SUMMARY = "Documentation for texlive-ly1"
DESCRIPTION = "This package includes the documentation for texlive-ly1"
LICENSE = "LPPL-1.0"

PV = "2023.208.svn63565"

RPM_NAME = "texlive-ly1-doc-2023.208.svn63565-53.1.noarch.rpm"
RPM_HASH = "da8b41c1cde6095cd87a17785d887e9866eaa6d4132b91f7c4b54dcccd7549f106b25e22cd91f50c9fdae13ec57136fb62f55f120841dd23e6576939d28679b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ly1-doc"

RDEPENDS:${PN} += ""

inherit rpm
