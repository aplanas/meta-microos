SUMMARY = "Always keep upright shape for some punctuation marks and Arabic numerals"
DESCRIPTION = "The package provides a mechanism to keep punctuation always in \
upright shape even if italic was specified. It is directed to \
Latin Modern fonts, and provides .tfm, .vf, .fd, and .sty \
files. Here a list of punctuation characters always presented \
in upright shapes: comma, period, semicolon, colon, \
parentheses, square brackets, and Arabic numerals."
LICENSE = "LPPL-1.3c"

PV = "2023.209.0.0.1svn42334"

RPM_NAME = "texlive-uppunctlm-2023.209.0.0.1svn42334-54.1.noarch.rpm"
RPM_HASH = "9702a09aed720513ff44749cdad6cb137791a0fb1cdd37b2708859fbed898970de2d54f054e0229dde00efddbfbd787d427788c85a56ecfae9d5612e7ebccf81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ec-uplmri10.tfm \
tex-ec-uplmri10.vf \
tex-ec-uplmri12.tfm \
tex-ec-uplmri12.vf \
tex-ec-uplmri7.tfm \
tex-ec-uplmri7.vf \
tex-ec-uplmri8.tfm \
tex-ec-uplmri8.vf \
tex-ec-uplmri9.tfm \
tex-ec-uplmri9.vf \
tex-t1uplmr.fd \
tex-uppunctlm.sty \
texlive-uppunctlm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ec-lmr10.tfm \
tex-ec-lmr12.tfm \
tex-ec-lmr7.tfm \
tex-ec-lmr8.tfm \
tex-ec-lmr9.tfm \
tex-ec-lmri10.tfm \
tex-ec-lmri12.tfm \
tex-ec-lmri7.tfm \
tex-ec-lmri8.tfm \
tex-ec-lmri9.tfm \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
