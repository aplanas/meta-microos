SUMMARY = "Busybox applets replacing netcat"
DESCRIPTION = "This package contains the symlinks to provide nc with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-netcat-1.36.1-29.1.noarch.rpm"
RPM_HASH = "5dc7634db3782c2baf6573a07c1a18f08af7e74f4671313b41047510fe45b1a83f4d12d3fe48e2eca66be01652ba71279632b2489411fa5b87c2d951999b9642"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-netcat"

RDEPENDS:${PN} += "busybox"

inherit rpm
