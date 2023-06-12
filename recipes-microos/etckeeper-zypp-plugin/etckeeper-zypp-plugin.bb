SUMMARY = "The etckeeper integration function with ZYpp"
DESCRIPTION = "The etckeeper-zypp-plugin calls etckeeper from ZYpp."
LICENSE = "GPL-2.0-or-later"

PV = "1.18.18"

RPM_NAME = "etckeeper-zypp-plugin-1.18.18-2.2.noarch.rpm"
RPM_HASH = "abaf6995982ffa7a06e1f6293c2fa2ba16869bde6b114833413f06887eba924502b68d5d7d8e30af20da4562290b039cf5020654281818a877d481b7dd69a882"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "etckeeper-pkgmanager-collabo \
etckeeper-zypp-plugin \
etckeeper:/usr/lib/zypp/plugins/commit/zypper-etckeeper.py"
RDEPENDS:${PN} += "/usr/bin/python3 \
etckeeper \
python3-zypp-plugin"

inherit rpm
