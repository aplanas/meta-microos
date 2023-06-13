SUMMARY = "Mint Themes -- Common Files"
DESCRIPTION = "A collection of Mint GTK+ themes."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.8"

RPM_NAME = "metatheme-mint-common-2.0.8-1.1.noarch.rpm"
RPM_HASH = "10963f2659dfdb2d00a4b1f039056c70a29ca03ea6c903f2f096c38b0ff434f98403f74ffa7307312fa8ce9ed79cd545e5ed231387da8d07f56b3eafaf5f5dd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cinnamon-themes \
metatheme-mint-common \
mint-themes"

RDEPENDS:${PN} += ""

inherit rpm
