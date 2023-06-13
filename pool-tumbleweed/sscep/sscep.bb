SUMMARY = "A command line client for the SCEP protocol"
DESCRIPTION = "Simple SCEP (Simple Certificate Enrollment Protocol) client with \
modifications for engine support & more."
LICENSE = "BSD-3-Clause-Attribution & OpenSSL"

PV = "0.10.0"

RPM_NAME = "sscep-0.10.0-1.8.aarch64.rpm"
RPM_HASH = "b49208905fa7b2ac0be7571c8f7b777bfc812c023b97e5d74d2b970f6b3f42c6f471ed6c34d98bcab6fcad0defaf8b83a095b285385f18ec8b68b606841daefd"

RPROVIDES:${PN} += "config(sscep) \
sscep \
sscep(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit)"

inherit rpm
