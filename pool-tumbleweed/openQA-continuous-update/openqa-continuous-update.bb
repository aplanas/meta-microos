SUMMARY = "Continuously update packages from devel:openQA"
DESCRIPTION = "Use this package to install and enable a systemd service for continuously \
upgrading the system if devel:openQA packages are stable and contain updates. It \
is complementary to auto-update which also reboots the system and does updates \
regardless of whether devel:openQA contains updates."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1689360748.edd4aa1"

RPM_NAME = "openQA-continuous-update-4.6.1689360748.edd4aa1-1.1.aarch64.rpm"
RPM_HASH = "f48c9a872d180b9e1c872db6603366800d2d08a7e264f6a88643e0b8116d3b857fad85827356b030b801a804abae606c6c41ddf4c0b69dac5ffc4ad206733d73"

RPROVIDES:${PN} += "openQA-continuous-update"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
curl \
openQA-common"

inherit rpm
