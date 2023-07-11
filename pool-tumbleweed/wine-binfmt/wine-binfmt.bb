SUMMARY = "The binfmt_misc support for Windows"
DESCRIPTION = "Run Windows(tm) executables out of the box."
LICENSE = "GPL-2.0"

PV = "1.2.1"

RPM_NAME = "wine-binfmt-1.2.1-1.3.noarch.rpm"
RPM_HASH = "128c0c1775e84376f156474ebe16862703ff93c64c02abae0ef5cf881474f075c6b516db40a74035cc39aa3dfb80544237f01b7830ed321f09b15cc5755d6894"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wine-binfmt"

RDEPENDS:${PN} += "/usr/bin/sh \
systemd \
wine"

inherit rpm
