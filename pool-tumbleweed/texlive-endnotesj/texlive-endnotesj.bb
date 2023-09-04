SUMMARY = "Japanese-style endnotes"
DESCRIPTION = "This package provides customized styles for endnotes to be used \
with Japanese documents. It can be used on pLaTeX, upLaTeX, and \
LuaLaTeX (LuaTeX-ja)."
LICENSE = "BSD-3-Clause"

PV = "2023.209.3.0svn47703"

RPM_NAME = "texlive-endnotesj-2023.209.3.0svn47703-54.2.noarch.rpm"
RPM_HASH = "03840e9283fcd000e6eea2e99b840f032214f94e84b70c2179cf15a838a05cd8c4021b09ee7f788f57092f7a23003244a863a5b44d40fdf1630ff3e8bf9f7473"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-endnotesj.sty \
texlive-endnotesj"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-endnotes.sty \
tex-luatexja-otf.sty \
tex-otf.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
