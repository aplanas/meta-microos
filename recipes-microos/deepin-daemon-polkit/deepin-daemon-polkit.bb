SUMMARY = "Deepin daemon polkit profiles"
DESCRIPTION = "This package provides polkit profiles for deepin-daemon. These profiles are not \
adopted by security team. If you need the polkit feature, you should install \
them manually or use deepin-polkit-install package."
LICENSE = "GPL-3.0-or-later"

PV = "5.14.45"

RPM_NAME = "deepin-daemon-polkit-5.14.45-2.3.noarch.rpm"
RPM_HASH = "4f0d89be92b0de7cfb1d201776edb040352d446b56eda013730604fd7689aef9080843f2f1cef05a63f3e83969fcfe4f43f3dd03b7d8e80ef36bcf06c174eac7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-daemon-polkit"
RDEPENDS:${PN} += "deepin-daemon"

inherit rpm
