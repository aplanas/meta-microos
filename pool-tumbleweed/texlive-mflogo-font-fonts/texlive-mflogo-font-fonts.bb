SUMMARY = "Severed fonts for texlive-mflogo-font"
DESCRIPTION = "The  separated fonts package for texlive-mflogo-font"
LICENSE = "SUSE-TeX"

PV = "2023.201.1.002svn54512"

RPM_NAME = "texlive-mflogo-font-fonts-2023.201.1.002svn54512-54.1.noarch.rpm"
RPM_HASH = "fe4b5dee6d11ecb682ff376ad81ec4645f181986236431ed5473c8f02e19ef3491b4f2f2092ed79d0156bea6dffdd40a61970a010304ef8ba1e3e276a1971ab6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-logo10 \
font-logo8 \
font-logo9 \
font-logobf10 \
font-logod10 \
font-logosl10 \
font-logosl8 \
font-logosl9 \
texlive-mflogo-font-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
