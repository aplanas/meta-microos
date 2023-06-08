SUMMARY = "Dynamic Kernel Module Support Framework"
DESCRIPTION = "This package contains the framework for the Dynamic \
Kernel Module Support (DKMS) method for installing \
module RPMS as originally developed by Dell."
LICENSE = "GPL-2.0-only"

PV = "2.8.8"

RPM_NAME = "dkms-2.8.8-1.2.noarch.rpm"
RPM_HASH = "b672ac6b44420dedc6f2428893d632a511b4f5eec62e9431355f1ddc1f9fa6e054bf1ebec1fc6c61323cfde0737a3145ffaa14c4e7ebab5e7e41665e4abb838e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(dkms) dkms"
RDEPENDS:${PN} += "/bin/bash /bin/sh bash cpio findutils gawk gcc grep gzip kernel-syms make mktemp modutils sed systemd tar zstd"

inherit rpm
