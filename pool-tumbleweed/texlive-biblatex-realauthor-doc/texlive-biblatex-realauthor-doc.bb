SUMMARY = "Documentation for texlive-biblatex-realauthor"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-realauthor"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.7.1asvn45865"

RPM_NAME = "texlive-biblatex-realauthor-doc-2023.209.2.7.1asvn45865-54.1.noarch.rpm"
RPM_HASH = "7e78073efb6b07df69c4f66766b3be33c1f6bcb237f60bf1a44b14d947f3e2b48d90a287f1146074c4fcb2926eff40a8b75aad8fe15b383474a48325ddd1b44f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-realauthor-doc"

RDEPENDS:${PN} += ""

inherit rpm
