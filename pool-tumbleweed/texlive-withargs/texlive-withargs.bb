SUMMARY = "In-place argument substitution"
DESCRIPTION = "The \\withargs command provides a clean way to populate a \
template (containing #1, #2, etc.) using LaTeX argument \
substitution. It also allows you to carefully control argument \
expansion using a LaTeX3-style argument specification. Uses \
range from creating readable string templates (akin to C's \
printf function) to performing otherwise complex token-list \
manipulation."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3.1svn52641"

RPM_NAME = "texlive-withargs-2023.201.0.0.3.1svn52641-53.1.noarch.rpm"
RPM_HASH = "12fe3e8e95e4758416197f08ef4908a502010c99cec9009b7725257fe90f28044cff957c3dbdaac6fa7a9964ff7de5af71de05f721a8141eab4281012b3dbaef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(withargs-dry.sty) \
tex(withargs-packagedoc.cls) \
tex(withargs.sty) \
texlive-withargs"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
tex(expl3.sty) \
tex(filecontents.sty) \
tex(hyperref.sty) \
tex(ifthen.sty) \
tex(listings.sty) \
tex(marginnote.sty) \
tex(mdframed.sty) \
tex(needspace.sty) \
tex(noindentafter.sty) \
tex(textcomp.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
