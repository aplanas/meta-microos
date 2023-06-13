SUMMARY = "Deepin daemon polkit profiles"
DESCRIPTION = "This package provides polkit profiles for deepin-daemon. These profiles are not \
adopted by security team. If you need the polkit feature, you should install \
them manually or use deepin-polkit-install package."
LICENSE = "GPL-3.0-or-later"

PV = "5.14.45"

RPM_NAME = "deepin-daemon-polkit-5.14.45-2.4.noarch.rpm"
RPM_HASH = "5977d52103ef33ec086b594d51f6cc4f869cb2907a8a752e7d666123d5444290320d627ada6fd5e6f8736a920f0de8cc234a5d0223d5ea7e488a75a089641d55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-daemon-polkit"

RDEPENDS:${PN} += "deepin-daemon"

inherit rpm
