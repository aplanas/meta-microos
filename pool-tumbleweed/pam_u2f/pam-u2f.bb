SUMMARY = "U2F authentication integration into PAM"
DESCRIPTION = "The PAM U2F module provides a way to integrate the Yubikey \
(or other U2F-compliant authenticators) into the existing user \
authentication infrastructure."
LICENSE = "BSD-2-Clause"

PV = "1.3.0"

RPM_NAME = "pam_u2f-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "c5b9fc5ba62b8dcde8d35360d86f4e4fb66791b04ff7cb0817a9c7fc2be53faa806ac528cc1eb6f6c007f2b8ad114be7c2c9395dae2c744f3b5fe5e22c7dd05e"

RPROVIDES:${PN} += "pam-u2f"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libfido2.so.1 \
libpam.so.0"

inherit rpm
