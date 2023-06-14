SUMMARY = "Severed fonts for texlive-cjhebrew"
DESCRIPTION = "The  separated fonts package for texlive-cjhebrew"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2asvn43444"

RPM_NAME = "texlive-cjhebrew-fonts-2023.201.0.0.2asvn43444-53.1.noarch.rpm"
RPM_HASH = "4f9280fed9e25920c378ee26cdcba924ff65fc0bee74e48b45d411b8db930adc7794643df7ea05c76aa856a91d0a3949e8fa688e5c172b0303a8f7847d0585d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-cjheblsm \
font-cjhebltx \
texlive-cjhebrew-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
