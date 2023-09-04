SUMMARY = "Severed fonts for texlive-hamnosys"
DESCRIPTION = "The  separated fonts package for texlive-hamnosys"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.3svn61941"

RPM_NAME = "texlive-hamnosys-fonts-2023.209.1.0.3svn61941-54.2.noarch.rpm"
RPM_HASH = "90e89892554138ed44169096968820f4466509453ed4573f3b2a81bcddec78ce006cf6d65feb0bca49005837a6ad7860a650660bd6f995a59cc1254085d9fecf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-hamnosysunicode \
texlive-hamnosys-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
