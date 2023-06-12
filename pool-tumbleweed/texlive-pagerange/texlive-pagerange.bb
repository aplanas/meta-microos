SUMMARY = "Flexible and configurable page range typesetting"
DESCRIPTION = "The package defines a command \\pagerange that typesets ranges \
of page numbers, expanding them (e.g., adding first or last \
page numbers) and standardising them."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn16915"

RPM_NAME = "texlive-pagerange-2023.201.0.0.5svn16915-51.1.noarch.rpm"
RPM_HASH = "4c0bc060f88c382c1b921d33f011091af646c3ae06e909a1e791133e772c956675c1caace3994f32613b4e11b2b8f40779647c7fa631fd596660e14cb04ea2db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pagerange-guide.cfg) \
tex(pagerange.sty) \
texlive-pagerange"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(lastpage.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
