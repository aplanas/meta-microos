SUMMARY = "Create Object-Role Model (ORM) diagrams"
DESCRIPTION = "The package provides styles for drawing Object-Role Model (ORM) \
diagrams in TeX based on the PGF and TikZ picture environment."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.1.4svn61719"

RPM_NAME = "texlive-tkz-orm-2023.201.0.0.1.4svn61719-52.1.noarch.rpm"
RPM_HASH = "b69edc4ecb6a7caa4437add683747aee708e93efb7fc4404e6e259329e3b8cc3c8ecd1eda16bcab167af45e824ec9abb4ab2702d82296d1ab300b2fd928f209b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tkz-orm.sty \
texlive-tkz-orm"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
