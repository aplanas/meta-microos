SUMMARY = "Go tool for managing Linux filesystem encryption"
DESCRIPTION = "fscrypt is a high-level tool for the management of Linux filesystem encryption. \
This tool manages metadata, key generation, key wrapping, PAM integration, and \
provides a uniform interface for creating and modifying encrypted directories."
LICENSE = "Apache-2.0"

PV = "0.3.4"

RPM_NAME = "fscrypt-0.3.4-3.3.aarch64.rpm"
RPM_HASH = "aee7e46b2d227e5ddb9adfdda933edebe868271f7899f01675ea0a519b4a57650592cd39d4f604212e21538134a6ae3cd110e03b3be539998748a31278a820a9"

RPROVIDES:${PN} += "fscrypt fscrypt(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) libpam.so.0(LIBPAM_EXTENSION_1.0)(64bit) pam-fscrypt"

inherit rpm
