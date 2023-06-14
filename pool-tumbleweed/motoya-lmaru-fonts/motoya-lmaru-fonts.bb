SUMMARY = "Japanese Round-Gothic-Typeface Fonts Designed by Motoya"
DESCRIPTION = "This package provides a font family named 'MotoyaLMaru W3 mono'. \
It was provided to Android platform by Motoya."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "motoya-lmaru-fonts-1.0.0-11.17.noarch.rpm"
RPM_HASH = "a9a3dc2cd461767301698b1842e285a11dfb37d52e470669f8de087abc3281790c0df17ebec1a4301745f91b50cfbac2e18372de9d006f41cdaa17a65f063bef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "motoya-lmaru-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
