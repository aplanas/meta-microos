SUMMARY = "Go tool for managing Linux filesystem encryption"
DESCRIPTION = "fscrypt is a high-level tool for the management of Linux filesystem encryption. \
This tool manages metadata, key generation, key wrapping, PAM integration, and \
provides a uniform interface for creating and modifying encrypted directories."
LICENSE = "Apache-2.0"

PV = "0.3.4"

RPM_NAME = "fscrypt-0.3.4-3.5.aarch64.rpm"
RPM_HASH = "08944ddd62b3186e8774f9f462f245eff78c52a07c9a80ee414668ca7ba443e8cd895636699ac7671cf9e99bc5ce7b4a4c6fd96f592ef4dcd022c5188a65668d"

RPROVIDES:${PN} += "fscrypt"

RDEPENDS:${PN} += "libc.so.6 \
libpam.so.0 \
pam-fscrypt"

inherit rpm
