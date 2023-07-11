SUMMARY = "Continuously update packages from devel:openQA"
DESCRIPTION = "Use this package to install and enable a systemd service for continuously \
upgrading the system if devel:openQA packages are stable and contain updates. It \
is complementary to auto-update which also reboots the system and does updates \
regardless of whether devel:openQA contains updates."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1688565452.efc15ea"

RPM_NAME = "openQA-continuous-update-4.6.1688565452.efc15ea-1.1.aarch64.rpm"
RPM_HASH = "b8a3f7f4e447dc319997409fa221b2b10d6d213941206efec9ae8b192f3bd6a29431009d705a4ae34eeb1bf2994c177c8d214791f58304b0eb562525af8d66c7"

RPROVIDES:${PN} += "openQA-continuous-update"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
curl \
openQA-common"

inherit rpm
