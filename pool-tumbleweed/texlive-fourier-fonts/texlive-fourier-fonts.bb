SUMMARY = "Severed fonts for texlive-fourier"
DESCRIPTION = "The  separated fonts package for texlive-fourier"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3svn61937"

RPM_NAME = "texlive-fourier-fonts-2023.209.2.3svn61937-53.1.noarch.rpm"
RPM_HASH = "cd778a94af229419c1c35db0e179df7c6644dba31ffee28cec4d7d4691f6428a7106c0242f7e72e549f03e391a7dce4aed8a58cb7f3d3bebd812012998578343"
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
