SUMMARY = "Configuration for module loading and SUSE-specific utilities for KMPs"
DESCRIPTION = "This package contains helper scripts for KMP installation and \
uninstallation, as well as default configuration files for depmod and \
modprobe."
LICENSE = "GPL-2.0-or-later"

PV = "16.0.34"

RPM_NAME = "suse-module-tools-16.0.34-1.1.aarch64.rpm"
RPM_HASH = "22c0edf615bee9127d735c6c706c2df8d833472b67b0b648f458932d25cf480bbe89dce294b97d1901c9c7c5cc33b5251630891299b974959f1dcda1b2aebe06"

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
