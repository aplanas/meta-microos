SUMMARY = "Configuration for module loading and SUSE-specific utilities for KMPs"
DESCRIPTION = "This package contains helper scripts for KMP installation and \
uninstallation, as well as default configuration files for depmod and \
modprobe."
LICENSE = "GPL-2.0-or-later"

PV = "16.0.30"

RPM_NAME = "suse-module-tools-16.0.30-1.1.aarch64.rpm"
RPM_HASH = "2d90e606f16f258b9b54cdcb16f4cee10ed65c27f8c2aa7d76882749108e1277e862b79e8bea0e141542ad04db7da486c209f3dd3e2e7e7cfb87f62e92a4b8ee"

RPROVIDES:${PN} += "suse-module-tools \
system-tuning-common-SUSE \
udev-extra-rules"

RDEPENDS:${PN} += "-kmod(sg.ko) if kernel \
/bin/bash \
/bin/sh \
/usr/bin/grep \
/usr/bin/gzip \
/usr/bin/perl \
/usr/bin/sed \
coreutils \
findutils \
rpm \
systemd-rpm-macros"

inherit rpm
