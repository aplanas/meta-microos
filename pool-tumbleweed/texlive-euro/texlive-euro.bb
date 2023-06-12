SUMMARY = "Provide Euro values for national currency amounts"
DESCRIPTION = "Converts arbitrary national currency amounts using the Euro as \
base unit, and typesets monetary amounts in almost any desired \
way. Write, e.g., \\ATS{17.6} to get something like '17,60 oS \
(1,28 Euro)' automatically. Conversion rates for the initial \
Euro-zone countries are already built-in. Further rates can be \
added easily. The package uses the fp package to do its sums."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn22191"

RPM_NAME = "texlive-euro-2023.201.1.1svn22191-52.1.noarch.rpm"
RPM_HASH = "fd44c819b88607ebbfa30c96318a186af32047194d7a048fd2b05e8b8976002bd0918a3cbef3b7eda4f4b405560aa8059ff6c24d0c1f3bb9df43194adc914241"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(euro.sty) \
texlive-euro"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fp-basic.sty) \
tex(fp-snap.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
