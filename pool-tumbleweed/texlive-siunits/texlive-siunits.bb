SUMMARY = "International System of Units"
DESCRIPTION = "Typeset physical units following the rules of the International \
System of Units (SI). The package requires amstext, for proper \
representation of some values. Note that the package is now \
superseded by siunitx; siunits has maintenance-only support, \
now."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.36svn59702"

RPM_NAME = "texlive-siunits-2023.209.1.36svn59702-58.1.noarch.rpm"
RPM_HASH = "21dfcb8eea6cb958c1adc0d79f65e1cf5baf44fb61e40cf5b4e286d3f9b91ffff586a0e275dad9a7a286e7fbe9978012c659e3a8fe435a0ee9b87b2556c0824f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-SIunits.cfg \
tex-SIunits.sty \
tex-binary.sty \
texlive-siunits"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amstext.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
