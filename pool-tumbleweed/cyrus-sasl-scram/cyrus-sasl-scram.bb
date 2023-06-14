SUMMARY = "Plugin for the SCRAM SASL mechanism"
DESCRIPTION = "This is the Cyrus SASL API implementation. It can be used on the client \
or server side to provide authentication. See RFC 5802 for more \
information."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-scram-2.1.28-5.1.aarch64.rpm"
RPM_HASH = "36534a437cb57bb7ae6ea204a67c4e108bbe4a971c215e450591423ea02f2123fda6226dd21badf2b4448acc640a89aee5a3dcc2f46be4cb00f80222bff5624f"

RPROVIDES:${PN} += "cyrus-sasl-scram \
libscram.so.3"

RDEPENDS:${PN} += "cyrus-sasl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
