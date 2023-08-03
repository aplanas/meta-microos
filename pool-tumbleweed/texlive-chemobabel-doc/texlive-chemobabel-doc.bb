SUMMARY = "Documentation for texlive-chemobabel"
DESCRIPTION = "This package includes the documentation for texlive-chemobabel"
LICENSE = "BSD-3-Clause"

PV = "2023.209.0.0.9lsvn64778"

RPM_NAME = "texlive-chemobabel-doc-2023.209.0.0.9lsvn64778-54.1.noarch.rpm"
RPM_HASH = "dd5cd24d27ed277ffb0a1ed871657fb8b32ecd74e3f32bbeb4c696b8724cefb28c6a40d247629f9491299bb351eabbfc008fa744122f6a7ff02dd0c10c60d153"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-chemobabel-doc-en;ja \
texlive-chemobabel-doc"

RDEPENDS:${PN} += ""

inherit rpm
