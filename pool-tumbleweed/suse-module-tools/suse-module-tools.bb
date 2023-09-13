SUMMARY = "Configuration for module loading and SUSE-specific utilities for KMPs"
DESCRIPTION = "This package contains helper scripts for KMP installation and \
uninstallation, as well as default configuration files for depmod and \
modprobe."
LICENSE = "GPL-2.0-or-later"

PV = "16.0.35"

RPM_NAME = "suse-module-tools-16.0.35-1.1.aarch64.rpm"
RPM_HASH = "3e7af9df66c9d5a80589eea05eb36f29c70d2f8c2dbb96c775c1720a293c12f8ca02b1612423ee0d9e1807f230d2bfa7d370945b9e0d28f5611232ccfa785875"

RPROVIDES:${PN} += "suse-module-tools \
system-tuning-common-SUSE \
udev-extra-rules"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/grep \
/usr/bin/gzip \
/usr/bin/perl \
/usr/bin/sed \
/usr/bin/sh \
coreutils \
findutils \
rpm \
systemd-rpm-macros"

inherit rpm
