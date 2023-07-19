SUMMARY = "RPM macros for building Kernel Module Packages"
DESCRIPTION = "This package provides the rpm macros and templates for Kernel Module Pakcages \
 \
Source Timestamp: 2023-07-11 06:23:11 +0000 \
GIT Revision: 5ab030f1f07fd96746960bce337ec62fc11b6a9a \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "kernel-macros-6.4.3-1.1.noarch.rpm"
RPM_HASH = "016429d13f7b935c685d1aa4f806563a3ebdced7abfc8b2fa7d7d9d3d251ce9ebe8c773001d5cbe0034fc52af96e4c1f1bcc0098879154334cb8906ebcfd6045"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-macros \
kernel-subpackage-macros \
rpm-macro--kernel-module-package \
rpm-macro-cpu-arch \
rpm-macro-kernel-build-shell-package \
rpm-macro-kernel-module-directory \
rpm-macro-kernel-module-package \
rpm-macro-kernel-module-package-buildreqs \
rpm-macro-kernel-module-package-release \
rpm-macro-linux-arch \
rpm-macro-linux-make-arch \
rpm-macro-suse-kernel-module-package"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh"

inherit rpm
