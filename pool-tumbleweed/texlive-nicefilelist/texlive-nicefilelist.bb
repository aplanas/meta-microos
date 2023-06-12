SUMMARY = "Provide \\listfiles alignment"
DESCRIPTION = "The package extends longnamefilelist, keeping separate columns \
for date, version and 'caption' (the caption now separately \
listed). Alignment is not disturbed by short file name \
extensions, such as '.fd'. The package is not compatible with \
longnamefilelist: users need to re-read the documentation."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9bsvn65842"

RPM_NAME = "texlive-nicefilelist-2023.201.0.0.9bsvn65842-54.1.noarch.rpm"
RPM_HASH = "9eebdcd19f16f5b33da5eb4748e490a8445c07a68aa226716bfb5cc9de62d565be4b541c8aeb79681c25359faf97f0a3d8551c7c0c4c126af55feed4e1fc58bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(nicefilelist.sty) \
texlive-nicefilelist"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(hardwrap.sty) \
tex(monofill.sty) \
tex(myfilist.sty) \
tex(xstring.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
