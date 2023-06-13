SUMMARY = "Cross referencing with proper definite articles"
DESCRIPTION = "By default, when using cleveref's \\cref to reference \
theorem-like environments, the names do not contain definite \
articles. In languages such as French, Italian, Portuguese, \
Spanish, etc. this results in incorrect grammar. For this \
purpose, the current package offers \\crefthe, which handles the \
definite articles properly (especially for the article \
contractions in many European languages)."
LICENSE = "LPPL-1.0"

PV = "2023.204.svn64498"

RPM_NAME = "texlive-crefthe-2023.204.svn64498-54.1.noarch.rpm"
RPM_HASH = "878f0f9dc79b783cd9223726ba3e4114572ff4b4d0f7e6ddbb197730ad88f40ccb6115dfeaea79f291fb3ec26baa107c1b130791b3a72ddff8a2aed20e637bca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(crefthe.sty) \
texlive-crefthe"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(cleveref.sty) \
tex(regexpatch.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
