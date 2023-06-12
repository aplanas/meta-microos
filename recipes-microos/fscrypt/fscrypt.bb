SUMMARY = "Go tool for managing Linux filesystem encryption"
DESCRIPTION = "fscrypt is a high-level tool for the management of Linux filesystem encryption. \
This tool manages metadata, key generation, key wrapping, PAM integration, and \
provides a uniform interface for creating and modifying encrypted directories."
LICENSE = "Apache-2.0"

PV = "0.3.4"

RPM_NAME = "fscrypt-0.3.4-3.4.aarch64.rpm"
RPM_HASH = "1d779b5324599f94bc10ba8f61a85a74c8b8e5cea2f0777858605eeefbd37efe6eab2c8d248423692e400fb4743de9c5a1085ad5fdb751cb5af65cebdfeb9540"

RPROVIDES:${PN} += "fscrypt fscrypt(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) libpam.so.0(LIBPAM_EXTENSION_1.0)(64bit) pam-fscrypt"

inherit rpm
