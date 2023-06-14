SUMMARY = "Severed fonts for texlive-pdftex"
DESCRIPTION = "The  separated fonts package for texlive-pdftex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn66243"

RPM_NAME = "texlive-pdftex-fonts-2023.201.svn66243-51.1.noarch.rpm"
RPM_HASH = "5bbf29264115632b53c18bb001cbd2b804e8b4b8a071928eb4e3148e21c53c86ee2d24caad91246091ac30db3d387c65af80f1464d9a7d80610b13377a108c5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-dummyspace \
font-pdftex \
texlive-pdftex-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
