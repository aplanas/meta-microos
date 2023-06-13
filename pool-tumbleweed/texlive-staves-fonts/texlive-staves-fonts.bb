SUMMARY = "Severed fonts for texlive-staves"
DESCRIPTION = "The  separated fonts package for texlive-staves"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-staves-fonts-2023.201.svn15878-57.1.noarch.rpm"
RPM_HASH = "d55e5aaf5be640c366cf7fb8af1c49d096fe074da2aa820aa05a930069f7e53981ec9a3923f254051f511d9dd1b918dc7da117b897a61f4797d334befb79f217"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(icelandic) \
texlive-staves-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
