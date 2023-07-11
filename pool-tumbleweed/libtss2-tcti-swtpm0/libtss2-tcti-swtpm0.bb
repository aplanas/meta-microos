SUMMARY = "TCTI swtpm interface library"
DESCRIPTION = "A TCTI for interaction with the TPM2 software simulator. It abstracts the \
details of direct communication with the interface and protocol exposed by the \
daemon hosting the TPM2 reference implementation."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "libtss2-tcti-swtpm0-4.0.1-1.4.aarch64.rpm"
RPM_HASH = "907f7e7eb116c9fc194fe5e1f85ac35a80e3db6e72f605be9154061efaeedd9ecf76959d756e420f9fbcca9a9401fcc862b292c862545518b8bb9e633c496606"

RPROVIDES:${PN} += "libtss2-tcti-swtpm.so.0 \
libtss2-tcti-swtpm0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtss2-mu.so.0"

inherit rpm
