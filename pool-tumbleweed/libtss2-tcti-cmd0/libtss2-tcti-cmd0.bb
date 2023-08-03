SUMMARY = "TCTI cmd interface library"
DESCRIPTION = "A TCTI for interaction with a subprocess. It abstracts the details of direct \
communication with the interface and protocol exposed by a subprocess that can \
receive and transmit raw TPM2 command and response buffers."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "libtss2-tcti-cmd0-4.0.1-2.1.aarch64.rpm"
RPM_HASH = "ca9522b9dfa69ed95ca17077264dc11e024cbee5236b1930d41c1db5cfce9124096ea0bd3677936745914946917c511ff58c750b2f72e26c8a66f36438b62fe9"

RPROVIDES:${PN} += "libtss2-tcti-cmd.so.0 \
libtss2-tcti-cmd0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtss2-mu.so.0"

inherit rpm
