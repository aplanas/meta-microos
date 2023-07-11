SUMMARY = "Busybox applets replacing gzip"
DESCRIPTION = "This package contains the symlinks to replace gzip with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-gzip-1.36.1-27.1.noarch.rpm"
RPM_HASH = "2afed5f334d54beb5457868e0fd2e880abf1e953ae34599fca2542d0f0c568eca4f10e77b39aadfefd002811820c65520852636a8957e66e70263fbe139a8eec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-gzip"

RDEPENDS:${PN} += "/usr/bin/sh \
busybox"

inherit rpm
