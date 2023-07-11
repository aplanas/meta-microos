SUMMARY = "Service for verifying that important services are running"
DESCRIPTION = "health-checker is a service running once at every reboot to verify \
that all important services are running. If it is the first reboot after \
an update, an automatic rollback to the last working snapshot is made. \
If this is not after an update, a reboot is made. If this does not help, \
the services will be disabled. \
This package does not contain any checks. For this, additional \
plugins for different products are needed."
LICENSE = "GPL-2.0-only"

PV = "1.9"

RPM_NAME = "health-checker-1.9-1.1.noarch.rpm"
RPM_HASH = "8a4590721c2250082fd8c72719c2b767bcea7073d966c811f91b63dff8e31f743f89be15b8026f09c0fb6ee0c3b453a3d8f54b2f3b534a11d1cc2b70280ad30b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "health-checker"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
health-checker-plugins"

inherit rpm
