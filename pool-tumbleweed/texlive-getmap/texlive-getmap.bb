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

PV = "2023.209.1.11svn50589"

RPM_NAME = "texlive-getmap-2023.209.1.11svn50589-53.1.noarch.rpm"
RPM_HASH = "5c27c7b21469e10be448678a51b7edc6901ed1c2955fface244c600d807c4fcd6aba7c2483ae3f45e09c3bc301732cb24ee00cb568c7767151e2287cc4e6551b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-getmap.cfg \
tex-getmap.sty \
texlive-getmap"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-ifxetex.sty \
tex-shellesc.sty \
tex-stringenc.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-getmap-bin \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
