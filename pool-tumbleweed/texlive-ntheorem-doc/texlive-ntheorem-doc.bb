SUMMARY = "Documentation for texlive-ntheorem"
DESCRIPTION = "This package includes the documentation for texlive-ntheorem"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.33svn27609"

RPM_NAME = "texlive-ntheorem-doc-2023.201.1.33svn27609-54.1.noarch.rpm"
RPM_HASH = "a97deab6c4d92f2d1a681510ec039374910d03c4af3580c344dec7ab9e238845751f6c38cb5376f2fea1b8ef26ddf2808f061a4a4694e00a2e134b2f887cbd80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-ntheorem-doc:en) \
texlive-ntheorem-doc"

RDEPENDS:${PN} += ""

inherit rpm
