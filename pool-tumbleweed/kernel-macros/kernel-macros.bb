SUMMARY = "RPM macros for building Kernel Module Packages"
DESCRIPTION = "This package provides the rpm macros and templates for Kernel Module Pakcages \
 \
Source Timestamp: 2023-07-25 04:42:30 +0000 \
GIT Revision: 55520bc826c5b1d40857ed0536eb87438cb95192 \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "kernel-macros-6.4.6-1.1.noarch.rpm"
RPM_HASH = "f303cb9ca2b62198b77d452d1cceedbbd89697b13b0d039559938f24cc200bce8a3d7385f6d7587372c72eef1fa7e8d8b930bd8e930eac6b1f01517ad9b624ab"
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
