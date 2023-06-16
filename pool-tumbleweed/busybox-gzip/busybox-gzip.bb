SUMMARY = "Busybox applets replacing gzip"
DESCRIPTION = "This package contains the symlinks to replace gzip with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-gzip-1.36.0-26.3.noarch.rpm"
RPM_HASH = "8e30290d1cd6ac6cf35ff368e37855cbf39e019d5132f6743f361a35a11ab9ef2489efa4700ee672798f7c6dd1a85dec58adc820564531a3754f0d60748bdac1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-gzip"

RDEPENDS:${PN} += "/usr/bin/sh \
busybox"

inherit rpm
