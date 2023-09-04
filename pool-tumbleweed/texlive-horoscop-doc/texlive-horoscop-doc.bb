SUMMARY = "Documentation for texlive-horoscop"
DESCRIPTION = "This package includes the documentation for texlive-horoscop"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.01svn56021"

RPM_NAME = "texlive-horoscop-doc-2023.209.1.01svn56021-54.2.noarch.rpm"
RPM_HASH = "eb0880d9975e24dabe2474e16606ff6ea4f6960a787365046b79b77eadf8d0a5ce09803c67ff27db219dd3c8c2032264230a7b6b40cc263d134d3f5ef80f3151"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-horoscop-doc"

RDEPENDS:${PN} += ""

inherit rpm
