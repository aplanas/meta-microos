SUMMARY = "String manipulation in LaTeX"
DESCRIPTION = "Coolstr is a subpackage of the cool bundle that deals with the \
manipulation of strings. A string is defined as a sequence of \
characters (not tokens). The package provides the ability to \
access a specific character of a string, as well as determine \
if the string contains numeric or integer data."
LICENSE = "LGPL-2.1-or-later"

PV = "2023.209.2.2svn15878"

RPM_NAME = "texlive-coolstr-2023.209.2.2svn15878-55.1.noarch.rpm"
RPM_HASH = "b4b5c4f95e3ef1ed3e734af6f5e45d7cefb507b3c9ea45bde693fb4c553e6a03194d68f6480626799124f2ce7dd03ff9bcdf1174f84895b15385825eea170efe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-coolstr.sty \
texlive-coolstr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
