SUMMARY = "Fix miscellaneous two column mode features"
DESCRIPTION = "OBSOLETE: do not use in new documents. This package will do \
nothing in LaTeX formats after 2015/01/01 as the fixes that it \
implements were incorporated into the fixltx2e package, which \
is itself obsolete as since the 2015/01/01 release these fixes \
are in the LaTeX format itself. Fix mark handling so that \
\\firstmark is taken from the first column if that column has \
any marks at all; keep two column floats like figure* in \
sequence with single column floats like figure."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.04svn38770"

RPM_NAME = "texlive-fix2col-2023.209.0.0.04svn38770-53.1.noarch.rpm"
RPM_HASH = "bf96bcd1531b2236ae15cf04b10adb2907343e3fa39559db772768ebd67966fe85e3872662a34d33f8716bcee14ccc153b854c0efc74c8c3c1afb408f5a6a5c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fix2col.sty \
texlive-fix2col"

RDEPENDS:${PN} += "/usr/bin/sh \
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
