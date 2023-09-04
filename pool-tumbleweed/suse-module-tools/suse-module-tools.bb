SUMMARY = "Configuration for module loading and SUSE-specific utilities for KMPs"
DESCRIPTION = "This package contains helper scripts for KMP installation and \
uninstallation, as well as default configuration files for depmod and \
modprobe."
LICENSE = "GPL-2.0-or-later"

PV = "16.0.33"

RPM_NAME = "suse-module-tools-16.0.33-1.1.aarch64.rpm"
RPM_HASH = "62e136f0ed7c5d297d716e788c1845fb3e5b81c6e4cd421e70bea53bda53621b9f22f460b864257ca015d9a7bc6c4ad743d7616a77595edc847be1123ddf7750"

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
