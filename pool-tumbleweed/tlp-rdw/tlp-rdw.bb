SUMMARY = "TLP Radio Device Wizard"
DESCRIPTION = "TLP implements advanced power management for Linux. \
TLP is a pure command line tool with automated background tasks. \
It does not contain a GUI. \
 \
Switch radios upon network connect/disconnect and dock/undock."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.5.0"

RPM_NAME = "tlp-rdw-1.5.0-1.4.noarch.rpm"
RPM_HASH = "cc0e865c7623062982ba1a5023f309a9aa00b5fcfe082af744464bcd91d46e8e05694fd471449d0b8439b0df06dd9242d2c981bc20743173cdcd5dd212972b47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tlp-rdw"

RDEPENDS:${PN} += "/usr/bin/sh \
NetworkManager \
systemd \
tlp"

inherit rpm
