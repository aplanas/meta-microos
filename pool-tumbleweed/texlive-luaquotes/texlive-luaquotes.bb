SUMMARY = "Smart setting of quotation marks"
DESCRIPTION = "This package automatically generates quotation marks and \
punctuation depending on the selected language."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.4.0svn65652"

RPM_NAME = "texlive-luaquotes-2023.208.1.4.0svn65652-53.1.noarch.rpm"
RPM_HASH = "4b45ab878bcf5bd8961104fdaf9d706c2a6a47b6a5959bd7367f2c12c394f8bdbc51065310148d3eaa44f239d35f5279953caaea8577ba62b3db03a629c095f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luaquotes.sty \
texlive-luaquotes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-iftex.sty \
tex-luacode.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
