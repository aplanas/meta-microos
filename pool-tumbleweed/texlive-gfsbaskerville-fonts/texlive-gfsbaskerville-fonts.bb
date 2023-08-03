SUMMARY = "Severed fonts for texlive-gfsbaskerville"
DESCRIPTION = "The  separated fonts package for texlive-gfsbaskerville"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn19440"

RPM_NAME = "texlive-gfsbaskerville-fonts-2023.209.1.0svn19440-53.1.noarch.rpm"
RPM_HASH = "7e35b1df1cc71bd02f6982792116dc80f067301cb71d63a33e0e931c87322cd3a85100b0033d288fe04a0042d32ef848032da3b9f80dd8eb0f65ad34547409ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-gfsbaskerville-fonts \
font--lang=el \
font-gfsbaskerville \
texlive-gfsbaskerville-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
