SUMMARY = "TCTI cmd interface library"
DESCRIPTION = "A TCTI for interaction with a subprocess. It abstracts the details of direct \
communication with the interface and protocol exposed by a subprocess that can \
receive and transmit raw TPM2 command and response buffers."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "libtss2-tcti-cmd0-4.0.1-1.4.aarch64.rpm"
RPM_HASH = "f17d70209d26757d8723d6fd4fd5722b70e3fa81196236c7ad4be3b4f32366c9d353eb28188d046486847f75804f80f34b408b184093a60734aed821714a4146"

RPROVIDES:${PN} += "libtss2-tcti-cmd.so.0 \
libtss2-tcti-cmd0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtss2-mu.so.0"

inherit rpm
