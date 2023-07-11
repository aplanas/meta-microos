SUMMARY = "Performance Co-Pilot run-time web library"
DESCRIPTION = "Performance Co-Pilot (PCP) run-time web library"
LICENSE = "LGPL-2.1+"

PV = "5.2.5"

RPM_NAME = "libpcp_web1-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "2e88bff77a3199c3adf4cb862ef481995b9ea686f7b15e110fadff76fe5ba919c4528ab3063fd2f2f984866d6ebd1fbdf44bc5744c32c6b1c1153283120235e8"

RPROVIDES:${PN} += "libpcp-web.so.1 \
libpcp-web1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3 \
libssl.so.3 \
libuv.so.1"

inherit rpm
