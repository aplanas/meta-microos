SUMMARY = "Development Package for DSSI plugins"
DESCRIPTION = "This package contains files to be needed for building DSSI plugins."
LICENSE = "GPL-2.0+ & LGPL-2.1+ & SUSE-Public-Domain"

PV = "1.1.1"

RPM_NAME = "dssi-devel-1.1.1-11.28.aarch64.rpm"
RPM_HASH = "9a6acef21202b4765f5606c53b9cb87bec3ea7f7b8d2af4f51e6d66aa9ddd44525af198ccd14f52581fa4cd7ce7ada43aa2b9ea5e35218c541783bce4e75c24b"

RPROVIDES:${PN} += "dssi-devel \
pkgconfig-dssi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
ladspa-devel"

inherit rpm
