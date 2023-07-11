SUMMARY = "Configuration for module loading and SUSE-specific utilities for KMPs"
DESCRIPTION = "This package contains helper scripts for KMP installation and \
uninstallation, as well as default configuration files for depmod and \
modprobe."
LICENSE = "GPL-2.0-or-later"

PV = "16.0.32"

RPM_NAME = "suse-module-tools-16.0.32-1.1.aarch64.rpm"
RPM_HASH = "f5d126dee3b0b7cc4a784e59bbde4ef782bb885e8c05f9316dc62e1dee7e7daafda86eec28d49a79cb0c7d8e763fa61855db1e565708ad1791ab1fe8ccbdda8a"

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
