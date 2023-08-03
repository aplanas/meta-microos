SUMMARY = "Severed fonts for texlive-figbas"
DESCRIPTION = "The  separated fonts package for texlive-figbas"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.3svn28943"

RPM_NAME = "texlive-figbas-fonts-2023.209.1.0.3svn28943-53.1.noarch.rpm"
RPM_HASH = "b04c62135800d7bc378f9bf28c9993ea3dcca4f8ba1aae2f7e1ac8d78ff88fdfd888cde72caa0ac1746b48afa86f229d7d38e14003a47ffe0c5f7cab36db4ae7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-computermodern \
font-texpalladiol \
texlive-figbas-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
