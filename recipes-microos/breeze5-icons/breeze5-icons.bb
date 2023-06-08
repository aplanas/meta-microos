SUMMARY = "Breeze icon theme"
DESCRIPTION = "Breeze-icons is a freedesktop.org compatible icon theme."
LICENSE = "LGPL-3.0-only"

PV = "5.105.0"

RPM_NAME = "breeze5-icons-5.105.0-1.1.noarch.rpm"
RPM_HASH = "0444ef9f301536fc30fca7e2bde941e8f08cb2038b579bea05719ba647182d7de419754df38b81d4ddf4d300dd1aeb36235960dcd0b5a44d734d7965976038c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "breeze5-icons"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
