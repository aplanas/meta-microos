SUMMARY = "Documentation for texlive-greektex"
DESCRIPTION = "This package includes the documentation for texlive-greektex"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn28327"

RPM_NAME = "texlive-greektex-doc-2023.209.svn28327-54.2.noarch.rpm"
RPM_HASH = "95f334d66eabc58311af5621c359dd144d1e8e1d8b5b5886d1056bec45662f03e209317c4195f0a59a00b95438595132967f01320bbf7afd05300773132caff6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-greektex-doc-el \
texlive-greektex-doc"

RDEPENDS:${PN} += ""

inherit rpm
