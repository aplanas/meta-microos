SUMMARY = "Headers for building apps that use libredfish"
DESCRIPTION = "This package contains headers required to build applications that use libredfish."
LICENSE = "BSD-3-Clause"

PV = "1.3.7.1+git.74758f1"

RPM_NAME = "libredfish1-1.3.7.1+git.74758f1-1.1.aarch64.rpm"
RPM_HASH = "9a092d0d757bcab356cb23afa27589213300845cdb1f91692b34ed0edccd4234c1e71269662e354a987855524b60f9314784e20105259be564abad28309b0a65"

RPROVIDES:${PN} += "libredfish.so.1 \
libredfish1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libcurl.so.4 \
libczmq.so.4 \
libjansson.so.4 \
libssl.so.1.1"

inherit rpm
