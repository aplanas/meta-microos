SUMMARY = "RPM macros for building Kernel Module Packages"
DESCRIPTION = "This package provides the rpm macros and templates for Kernel Module Pakcages \
 \
Source Timestamp: 2023-07-10 10:03:25 +0000 \
GIT Revision: b97b89494481f3409297e494e466bdd42b1311ab \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "kernel-macros-6.4.2-1.1.noarch.rpm"
RPM_HASH = "5a77318681f444aedaa6a0d102afc0636f96434d799aa242b05ddddb1dcfdb05abffbe54dd3d7b8a00f8b57f364027b0183cac9bcf590659edcaee46faba97c6"
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
