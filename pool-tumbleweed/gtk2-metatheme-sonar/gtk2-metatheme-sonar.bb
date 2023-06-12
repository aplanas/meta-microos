SUMMARY = "GTK+, Xfwm4 and Metacity Sonar Theme"
DESCRIPTION = "GTK+, Xfwm4 and Metacity theme created for openSUSE 11.2."
LICENSE = "GPL-2.0-or-later"

PV = "11.3.0"

RPM_NAME = "gtk2-metatheme-sonar-11.3.0-30.17.noarch.rpm"
RPM_HASH = "da29bbeb4bcf8a173d1d996e4cb7cbbf591117504bba95f7991ccc661a9fbe0fae407a63691a69896e28dd2ccf4b5f6d5555e993c167c6823be62aacfc206a3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-metatheme-sonar"
RDEPENDS:${PN} += "gtk2-engine-murrine \
metatheme-sonar-common"

inherit rpm
