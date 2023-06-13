SUMMARY = "Support for the ttf and otf DejaVu fonts"
DESCRIPTION = "Package dejavu-otf supports the free ttf-fonts from the DejaVu \
project which are available from GitHub or already part of your \
system (Windows/Linux/...) and the OpenType version of the \
TeXGyre Math, which is part of any TeX distribution.. Following \
font files are supported: DejaVuSans-BoldOblique.ttf \
DejaVuSans-Bold.ttf DejaVuSansCondensed-BoldOblique.ttf \
DejaVuSansCondensed-Bold.ttf DejaVuSansCondensed-Oblique.ttf \
DejaVuSansCondensed.ttf DejaVuSans-ExtraLight.ttf \
DejaVuSansMono-BoldOblique.ttf DejaVuSansMono-Bold.ttf \
DejaVuSansMono-Oblique.ttf DejaVuSansMono.ttf \
DejaVuSans-Oblique.ttf DejaVuSans.ttf \
DejaVuSerif-BoldItalic.ttf DejaVuSerif-Bold.ttf \
DejaVuSerifCondensed-BoldItalic.ttf \
DejaVuSerifCondensed-Bold.ttf DejaVuSerifCondensed-Italic.ttf \
DejaVuSerifCondensed.ttf DejaVuSerif-Italic.ttf DejaVuSerif.ttf \
texgyredejavu-math.otf"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.04svn45991"

RPM_NAME = "texlive-dejavu-otf-2023.201.0.0.04svn45991-52.1.noarch.rpm"
RPM_HASH = "6f627f9df8015ddfbcdce4f154c58c19a03730e88e4609a9e446dae29a9ad5a6e3a63dbfdfdf2dc10d862690ea4232bc5e4aaa21707e076a5cc886996fa04a33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(dejavu-otf.sty) \
texlive-dejavu-otf"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifluatex.sty) \
tex(ifxetex.sty) \
tex(textcomp.sty) \
tex(unicode-math.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
