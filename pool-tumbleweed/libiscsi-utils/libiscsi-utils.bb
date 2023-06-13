SUMMARY = "Some utilities for libiscsi"
DESCRIPTION = "libiscsi is a clientside library to implement the iSCSI protocol that can \
be used to access resource of an iSCSI target. \
 \
This package contains utilities based on libiscsi."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.19.0+git.20230208"

RPM_NAME = "libiscsi-utils-1.19.0+git.20230208-1.3.aarch64.rpm"
RPM_HASH = "ca8975735021f7cce5294cc0a9003665ddeb4bee4ba6b1bba5ef3d514db19dc05e3d0e1a86b1cbf0e1d47b572578de63c72c63c7f047b285d4204d1006124f1e"

RPROVIDES:${PN} += "libiscsi-utils \
libiscsi-utils(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libiscsi.so.9()(64bit)"

inherit rpm
