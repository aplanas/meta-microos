SUMMARY = "Download OpenStreetMap maps for use in documents"
DESCRIPTION = "The package provides a simple interface to OpenStreetMap, and \
to Google Maps 'map images'. In the simplest case, it is \
sufficient to specify the address you need (if you don't, the \
package will use its own default). The package loads the map \
image using an external lua script (invoked via \\write 18: \
LaTeX must be running with \\write 18 enabled). The ('external') \
lua script may be used from the command line; a bash version is \
provided."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.11svn50589"

RPM_NAME = "texlive-getmap-2023.201.1.11svn50589-52.1.noarch.rpm"
RPM_HASH = "c1019f11f62962c7d2d57dcedc2c8a4e51bfbe9543b8b12ceabcc49a49dbdec4948fb9da90085d6d9b39c34d088bd359baba159bccb84e688fce1a685febfe82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(getmap.cfg) \
tex(getmap.sty) \
texlive-getmap"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifthen.sty) \
tex(ifxetex.sty) \
tex(shellesc.sty) \
tex(stringenc.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-getmap-bin \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
