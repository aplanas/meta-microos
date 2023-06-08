SUMMARY = "A Collection of Free Persian OpenType Fonts"
DESCRIPTION = "This package contains collection of free Persian OpenType fonts."
LICENSE = "GPL-2.0+"

PV = "0.4"

RPM_NAME = "farsi-fonts-0.4-192.17.noarch.rpm"
RPM_HASH = "71778864488049e19c01d47070b8a043bfac09323877db69ccc7dd77efa88063e363f4cab19883b40e29469729da6efc99c209f92923efc484f44f89f200677b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "farsi-fonts farsifonts locale(fa) scalable-font-fa"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
