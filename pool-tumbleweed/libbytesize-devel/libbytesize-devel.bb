SUMMARY = "Development files for LibBytesize"
DESCRIPTION = "This package contains header files and pkg-config files needed for development \
with the LibBytesize library."
LICENSE = "LGPL-2.1-only"

PV = "2.8"

RPM_NAME = "libbytesize-devel-2.8-1.1.aarch64.rpm"
RPM_HASH = "70307d514c29bdf19c95e564301e6932f4320cee2703431d0bc7a525280e6b95d2885cef52a61a4ccbe03a3314ad6f4b4b5f5e80f26b1878e680c9e00e08bfd4"

RPROVIDES:${PN} += "libbytesize-devel \
pkgconfig-bytesize"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbytesize1"

inherit rpm
