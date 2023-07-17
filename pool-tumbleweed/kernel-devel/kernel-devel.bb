SUMMARY = "Development files needed for building kernel modules"
DESCRIPTION = "Kernel-level headers and Makefiles required for development of \
external kernel modules. \
 \
Source Timestamp: 2023-07-10 10:03:25 +0000 \
GIT Revision: b97b89494481f3409297e494e466bdd42b1311ab \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "kernel-devel-6.4.2-1.1.noarch.rpm"
RPM_HASH = "01272404bf0c19043ca2d65ef92d76eb9a97ede3182c5456591d4aa36f6517352feacb59149ac9de6d729e6df9bc14604cf44efd4c3c464e4a54b0220ba98091"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-devel \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
kernel-macros"

inherit rpm
