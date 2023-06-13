SUMMARY = "Documentation for texlive-copyrightbox"
DESCRIPTION = "This package includes the documentation for texlive-copyrightbox"
LICENSE = "LPPL-1.0"

PV = "2023.204.0.0.1svn24829"

RPM_NAME = "texlive-copyrightbox-doc-2023.204.0.0.1svn24829-54.1.noarch.rpm"
RPM_HASH = "a3049cf7dfebe5c4fd13969c768eba73800b1a8e546688103fa701a54b35cf80fe92f47e9830d66b8bfe1bae4ef0bdd8cdffcf41d958a039587b7ff510c07457"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-copyrightbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
