SUMMARY = "Macros for Manuscript Preparation for AAS Journals"
DESCRIPTION = "The bundle provides a document class for preparing papers for \
American Astronomical Society publications. Authors who wish to \
submit papers to AAS journals are strongly urged to use this \
class in preference to any of the alternatives available."
LICENSE = "LPPL-1.0"

PV = "2023.201.6.3.1svn58057"

RPM_NAME = "texlive-aastex-2023.201.6.3.1svn58057-54.1.noarch.rpm"
RPM_HASH = "9b588f4267a035e9213fd2ac4ddeeacc5022dc5f25a577be5f073f2746a96cb0c10b79486c199e9272eb41f99b4876e7fa3042d2dc1cdb710ca0cdf34e0595af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(aastex631.cls) \
texlive-aastex"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsmath.sty) \
tex(amssymb.sty) \
tex(array.sty) \
tex(epsf.sty) \
tex(graphicx.sty) \
tex(latexsym.sty) \
tex(lineno.sty) \
tex(longtable.sty) \
tex(times.sty) \
tex(ulem.sty) \
tex(url.sty) \
tex(xcolor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
