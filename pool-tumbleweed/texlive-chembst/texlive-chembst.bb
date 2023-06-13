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

PV = "2023.201.0.0.2.5svn15878"

RPM_NAME = "texlive-chembst-2023.201.0.0.2.5svn15878-53.1.noarch.rpm"
RPM_HASH = "b8fc070130fd0a573a53f3c0049f93c71abe65ad1aca027bae91ff6201409786713c3de6c5935379c1af4541cea57a3dc0075cf61bb06838fd3d4fb7f3acd303"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chembst"

RDEPENDS:${PN} += "/bin/sh \
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
