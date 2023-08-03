SUMMARY = "A collection of BibTeX files for chemistry journals"
DESCRIPTION = "The package offers a collection of advanced BibTeX style files \
suitable for publications in chemistry journals. Currently, \
style files for journals published by the American Chemical \
Society, Wiley-VCH and The Royal Society of Chemistry are \
available. The style files support advanced features such as \
automatic formatting of errata or creating an appropriate entry \
for publications in Angewandte Chemie where both English and \
German should be cited simultaneously."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2.5svn15878"

RPM_NAME = "texlive-chembst-2023.209.0.0.2.5svn15878-54.1.noarch.rpm"
RPM_HASH = "b0dabcee05515fd40e2fa01d48f96604d29a730e26f938883ca0b76ae81ae89aa0fa2faa4353d90d406cb891a537d836dae164cedf95da7e15cf02a8b7cfccd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chembst"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
