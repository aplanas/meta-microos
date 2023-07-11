SUMMARY = "Go tool for managing Linux filesystem encryption (the pam module)"
DESCRIPTION = "fscrypt is a high-level tool for the management of Linux filesystem encryption. \
This tool manages metadata, key generation, key wrapping, PAM integration, and \
provides a uniform interface for creating and modifying encrypted directories. \
 \
This package holds the pam module for fscrypt."
LICENSE = "Apache-2.0"

PV = "0.3.4"

RPM_NAME = "pam-fscrypt-0.3.4-3.5.aarch64.rpm"
RPM_HASH = "4313b4fd047eca49e53a4953d895e71dccf072358527378a21f3a2586bfa91c7f1e6a521006f36ee6952f8e006b141b97a44b6cfcc4dcb5dadc409005e0dfe27"

RPROVIDES:${PN} += "pam-fscrypt"

RDEPENDS:${PN} += "fscrypt \
libc.so.6 \
libpam.so.0"

inherit rpm
