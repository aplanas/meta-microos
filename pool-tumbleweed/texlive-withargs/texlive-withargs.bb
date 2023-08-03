SUMMARY = "In-place argument substitution"
DESCRIPTION = "The \\withargs command provides a clean way to populate a \
template (containing #1, #2, etc.) using LaTeX argument \
substitution. It also allows you to carefully control argument \
expansion using a LaTeX3-style argument specification. Uses \
range from creating readable string templates (akin to C's \
printf function) to performing otherwise complex token-list \
manipulation."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3.1svn52641"

RPM_NAME = "texlive-withargs-2023.209.0.0.3.1svn52641-54.1.noarch.rpm"
RPM_HASH = "331d0ec896b217ab54a48134420c254f699026dd1fe1baa60682002016ef827b347deb9e7186db2e9a837bee028f061a86caba7ccf63257d60193784e3f28c5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-withargs-dry.sty \
tex-withargs-packagedoc.cls \
tex-withargs.sty \
texlive-withargs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-expl3.sty \
tex-filecontents.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-listings.sty \
tex-marginnote.sty \
tex-mdframed.sty \
tex-needspace.sty \
tex-noindentafter.sty \
tex-textcomp.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
