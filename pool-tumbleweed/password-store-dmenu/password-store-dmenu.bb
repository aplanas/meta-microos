SUMMARY = "A dmenu interface to the 'pass' program"
DESCRIPTION = "A dmenu interface to 'pass', a password manager."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.4"

RPM_NAME = "password-store-dmenu-1.7.4-5.3.noarch.rpm"
RPM_HASH = "461653a895ab07d5c82e0ec1db29b75e6b9b95fac48b4f3075c36f8a25e213aa8a913f17c5cfb15daf0891090cb97c12803ae7fa4fb1194afa69e128d35cc10a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "password-store-dmenu"
RDEPENDS:${PN} += "/bin/bash \
dmenu \
password-store"

inherit rpm
