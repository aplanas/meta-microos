SUMMARY = "Spreadsheet features for LaTeX tabular environments"
DESCRIPTION = "The package allows the user to construct tables in a manner \
similar to a spreadsheet. The cells of a table have row and \
column indices and these can be used in formulas to generate \
values in other cells."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn50147"

RPM_NAME = "texlive-spreadtab-2023.201.0.0.5svn50147-57.1.noarch.rpm"
RPM_HASH = "1130aa7fdc9f79ed11abae988dc444afb468a90e315e5648013881584ecb96d36fa70066986ccf144fcc5dc13d76244ac95bc426d7900b588b0bc3982e893cc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(spreadtab.sty) \
texlive-spreadtab"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fp.sty) \
tex(xfp.sty) \
tex(xstring.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
