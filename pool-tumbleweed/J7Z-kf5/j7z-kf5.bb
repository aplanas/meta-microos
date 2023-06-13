SUMMARY = "KF5 service menu for J7Z"
DESCRIPTION = "J7Z is an alternative 7-Zip GUI. \
This package contains the KF5 service menu."
LICENSE = "LGPL-3.0-or-later"

PV = "1.4.2"

RPM_NAME = "J7Z-kf5-1.4.2-2.15.noarch.rpm"
RPM_HASH = "cd549029ebea7ada7db62ababce44038283bb3b6db296bd43b0f22258b490f87dec6ca3385cd51419bf14cdf7b60299b7f886ad001ebad06c2d0162e2b4b92c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "J7Z-kf5"

RDEPENDS:${PN} += "J7Z"

inherit rpm
