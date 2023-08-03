SUMMARY = "'Tabbing' front-end to stackengine"
DESCRIPTION = "The package provides a front end to the stackengine package, to \
allow tabbed stacking. In most cases, an existing stackengine \
command may be prepended with the word 'tabbed', 'align' or \
'tabular' to create a new tabbed version of a stacking macro. \
In addition, hooks in the package's parser that tabbed strings \
of data may be parsed, extracted, and reconstituted (not \
requiring use of any stacking constructions)."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.10svn46848"

RPM_NAME = "texlive-tabstackengine-2023.209.2.10svn46848-55.1.noarch.rpm"
RPM_HASH = "a4388daf4b19709f21e017e2c9135e78015c7e5ebfe2127340796492d5ec5cd1b2f6eae46141fe2b4b2b0d62068a1adcfb71df1d8814d0db76def565fd4b82af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tabstackengine.sty \
texlive-tabstackengine"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-listofitems.sty \
tex-stackengine.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
