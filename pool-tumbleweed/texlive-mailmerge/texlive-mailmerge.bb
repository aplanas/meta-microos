SUMMARY = "Repeating text field substitution"
DESCRIPTION = "The package mailmerge provides an interface to produce text \
from a template, where fields are replaced by actual data, as \
in a database. The package may be used to produce several \
letters from a template, certificates or other such documents. \
It allows access to the entry number, number of entries and so \
on."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0svn15878"

RPM_NAME = "texlive-mailmerge-2023.208.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "14a6f50ab7accc6be99d9cb7fb57a8a9282146c0a2881f16535963adbb25854cba4944fc130dd869edd850d0aa6e50d933cd3f39a6ff05b4cfae9fe0802bd1de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mailmerge.sty \
texlive-mailmerge"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
