SUMMARY = "KF5 service menu for J7Z"
DESCRIPTION = "J7Z is an alternative 7-Zip GUI. \
This package contains the KF5 service menu."
LICENSE = "LGPL-3.0-or-later"

PV = "1.4.2"

RPM_NAME = "J7Z-kf5-1.4.2-2.16.noarch.rpm"
RPM_HASH = "e44facc7bce94156a334650fac80f6f3cb0b3cb2ea2886ca52298cec83f619d9539d63527b0e43a4157255d5c7636af4284cb55759785f5784672ab17d68693a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "J7Z-kf5"

RDEPENDS:${PN} += "J7Z"

inherit rpm
