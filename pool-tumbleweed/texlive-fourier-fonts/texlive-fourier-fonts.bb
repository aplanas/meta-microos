SUMMARY = "Severed fonts for texlive-fourier"
DESCRIPTION = "The  separated fonts package for texlive-fourier"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3svn61937"

RPM_NAME = "texlive-fourier-fonts-2023.201.2.3svn61937-52.1.noarch.rpm"
RPM_HASH = "f307f02b02f2c46470f47510e6ce7cb0f9bb94c38c92ffc03d0f7f3bc421e6779cd409bb638f202d91cb298251bc1769d5b52cfe4d93497240fb5a65c88a895f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-fourier-fonts \
font-fourier-alternate-black \
font-fourier-alternate-bold \
font-fourier-alternate-bolditalic \
font-fourier-alternate-italic \
font-fourier-alternate-roman \
font-fourier-alternate-semibold \
font-fourier-alternate-semitalic \
font-fourier-math-blackboard \
font-fourier-math-cal \
font-fourier-math-extension \
font-fourier-math-letters \
font-fourier-math-symbols \
font-fourier-orns \
font-fourierorns \
texlive-fourier-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
