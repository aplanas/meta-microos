SUMMARY = "RPM macros for building Kernel Module Packages"
DESCRIPTION = "This package provides the rpm macros and templates for Kernel Module Pakcages \
 \
Source Timestamp: 2023-08-25 08:26:31 +0000 \
GIT Revision: f5aa89b3e95322c79e43c459f5b6862dec51fc5f \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "kernel-macros-6.4.12-1.1.noarch.rpm"
RPM_HASH = "fa84c08b52fc426699f777218c1fd12871c4300651e2592e1594a017e3dc78f05d19553a98b9a2af52b15f4a98a8dc12d58a6e1a3fd81a6cdc0e8b5c66c398ec"
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
