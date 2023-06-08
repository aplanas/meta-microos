SUMMARY = "Translations for package deepin-system-monitor"
DESCRIPTION = "Provides translations for the 'deepin-system-monitor' package."
LICENSE = "GPL-3.0-or-later"

PV = "5.8.27"

RPM_NAME = "deepin-system-monitor-lang-5.8.27-1.4.noarch.rpm"
RPM_HASH = "40a8c6b5e16f6b4a480346947f83deeadd3abe0149127e2c75f0cda2656f1f1d0e7674a593800e74ca2860a94d97ada45efeca19b8274a491a15dc198e014552"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-system-monitor-lang deepin-system-monitor-lang-all"
RDEPENDS:${PN} += "deepin-system-monitor"

inherit rpm
