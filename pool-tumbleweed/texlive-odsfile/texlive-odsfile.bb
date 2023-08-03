SUMMARY = "Read OpenDocument Spreadsheet documents as LaTeX tables"
DESCRIPTION = "The distribution includes a package and a lua library that can \
together read OpenDocument spreadsheet documents as LaTeX \
tables. Cells in the tables may be processed by LaTeX macros, \
so that (for example) the package may be used for drawing some \
plots. The package uses lua's zip library."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7svn65268"

RPM_NAME = "texlive-odsfile-2023.209.0.0.7svn65268-55.1.noarch.rpm"
RPM_HASH = "33f13941c943697e6ad33e22956783bb8d477ba7e74672ff7e361363f675487c812be8ef55bb89dba3ad31f08fa899eff21401f4b9503447d1721100bed14366"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-odsfile.sty \
texlive-odsfile"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-luacode.sty \
tex-xkeyval.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
