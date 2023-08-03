SUMMARY = "Documentation for texlive-keystroke"
DESCRIPTION = "This package includes the documentation for texlive-keystroke"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.6svn17992"

RPM_NAME = "texlive-keystroke-doc-2023.209.1.6svn17992-56.1.noarch.rpm"
RPM_HASH = "a1b6fa28679979179a4a7d1e3364fa9ceaf24fa7559ca4cde7a63dc11b052bc88fae9b0247574d4f9646101390653552024d9754cb9bb2d23b307c293a8f005e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-keystroke-doc"

RDEPENDS:${PN} += ""

inherit rpm
