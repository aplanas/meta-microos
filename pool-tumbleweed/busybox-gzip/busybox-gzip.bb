SUMMARY = "Busybox applets replacing gzip"
DESCRIPTION = "This package contains the symlinks to replace gzip with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-gzip-1.36.1-29.1.noarch.rpm"
RPM_HASH = "3d4264cd022d85e901ad2e38e0fc72f36ecb92b349b03912ba0ddd75953b0d39397988b35e81f9b1c3397150446e0414ca70cb0de8805848f0801289e7f5ec1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-gzip"

RDEPENDS:${PN} += "/usr/bin/sh \
busybox"

inherit rpm
