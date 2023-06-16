SUMMARY = "Continuously update packages from devel:openQA"
DESCRIPTION = "Use this package to install and enable a systemd service for continuously \
upgrading the system if devel:openQA packages are stable and contain updates. It \
is complementary to auto-update which also reboots the system and does updates \
regardless of whether devel:openQA contains updates."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1685738164.28716cd"

RPM_NAME = "openQA-continuous-update-4.6.1685738164.28716cd-1.1.aarch64.rpm"
RPM_HASH = "aa97490ffe4c05441bb69f726891b39a139c0900ecb356be6603b063b1edd8f293713039c05e4bb793d0dd4fc48611bb80cf50c056b7581dbaf0dcd6cefe551f"

RPROVIDES:${PN} += "openQA-continuous-update"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
curl \
openQA-common"

inherit rpm
