SUMMARY = "SUSE specific hardware tuning rules"
DESCRIPTION = "This package contains SUSE specific hardware tunings common to all SUSE brands."
LICENSE = "GPL-2.0-or-later"

PV = "0.2"

RPM_NAME = "udev-extra-rules-0.2-1.6.noarch.rpm"
RPM_HASH = "31a4767b889f067dc3b01d1c0ef72c1a02f0b6adcd6e1cea6a8bb92db4d76cba4c1d4b83ad9ef3539e2a7c2f10cadc76c5fb517a5e7c4e328e6160148ea515dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "system-tuning-common-SUSE \
udev-extra-rules"

RDEPENDS:${PN} += "/usr/bin/sh \
systemd"

inherit rpm
