SUMMARY = "Systemd unit files for python-django-eremaea2"
DESCRIPTION = "This package contains the systemd unit files for python-django-eremaea2."
LICENSE = "BSD-2-Clause"

PV = "2.0.18"

RPM_NAME = "eremaea-2.0.18-1.3.noarch.rpm"
RPM_HASH = "809344b0c2edffe7b64243e02ed2ccdaa8a978dd026a248828de44e3cba56b71e0ee15cd764ebf355100d4de3774b812342e4c9f13f69cf01e6b7bbe636abe1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eremaea"

RDEPENDS:${PN} += "/usr/bin/eremaeactl \
/usr/bin/sh"

inherit rpm
