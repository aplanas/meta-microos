SUMMARY = "TCTI swtpm interface library"
DESCRIPTION = "A TCTI for interaction with the TPM2 software simulator. It abstracts the \
details of direct communication with the interface and protocol exposed by the \
daemon hosting the TPM2 reference implementation."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "libtss2-tcti-swtpm0-4.0.1-2.1.aarch64.rpm"
RPM_HASH = "942ec606610d41b9880a92115f4604c063716e1fd182fb0f4e16c40036aad4381cd4fb1c3621ee8dc1a7f48f1fed2c672a1826964b40819a33bb3332da1dbdaf"

RPROVIDES:${PN} += "libtss2-tcti-swtpm.so.0 \
libtss2-tcti-swtpm0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtss2-mu.so.0"

inherit rpm
