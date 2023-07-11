SUMMARY = "Deepin daemon polkit profiles"
DESCRIPTION = "This package provides polkit profiles for deepin-daemon. These profiles are not \
adopted by security team. If you need the polkit feature, you should install \
them manually or use deepin-polkit-install package."
LICENSE = "GPL-3.0-or-later"

PV = "5.14.45"

RPM_NAME = "deepin-daemon-polkit-5.14.45-2.5.noarch.rpm"
RPM_HASH = "5793482a82933a6ba4f1e4a3ad69a01e91bfcf4b569edcdb8575961608dfc18cbbd68d1b269621e1b003d11e177d5edf156d4eadbba3862ccdd80ce36a732dfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-daemon-polkit"

RDEPENDS:${PN} += "deepin-daemon"

inherit rpm
