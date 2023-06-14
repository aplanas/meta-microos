SUMMARY = "Development files for aria2"
DESCRIPTION = "aria2 is a utility for downloading files. It has a segmented \
downloading engine in its core. It can download one file from \
multiple URLs or multiple connections from one URL. This can be used \
to speed up downloads with certain networks. The engine in was \
implemented in a single-thread model. \
 \
This package contains development files for its shared library."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "1.36.0"

RPM_NAME = "aria2-devel-1.36.0-1.11.aarch64.rpm"
RPM_HASH = "5732e3652147f49052648b74429eb4a45547fb186c577941d667433f2fe45ff52f218e0beb9ed852fc4b019aac19f8a57e63fdb4daabd9d9a89aa10995085b0c"

RPROVIDES:${PN} += "aria2-devel \
pkgconfig-libaria2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libaria2-0"

inherit rpm
