SUMMARY = "Industrial Monotype Font"
DESCRIPTION = "CPMono v07 is an industrial / high-tech monospace font."
LICENSE = "CC-BY-3.0"

PV = "1.0"

RPM_NAME = "cpmono_v07-fonts-1.0-11.17.noarch.rpm"
RPM_HASH = "9273f0da2c4865b49df52bce0ae24f10ae9da8f26c0657f40d0a87e2156a2f51e71f68a0bf4fd1845bcf783444309481e58305e480448fc908da24da6fda6a96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cpmono-v07-font \
cpmono-v07-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
