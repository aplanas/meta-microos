SUMMARY = "A pam module to authenticated saslauthd as a provider"
DESCRIPTION = "A pam module that allows authentication to saslauthd as a provider. This only provides authentication \
not authorisation so you MUST not use this as a complete auth provider."
LICENSE = "MPL-2.0"

PV = "0.1.0~3"

RPM_NAME = "pam_saslauthd-0.1.0~3-1.2.aarch64.rpm"
RPM_HASH = "ba50380ddd8f05155956cd7bbb50f88f6c831d8569ce0b48352ecdc2ced0580f92ee17fba68c044b3b6a1abde9accf20bdd38374fe7d6618f0d946dc2f7214f8"

RPROVIDES:${PN} += "bundled-rust-crate-libc \
bundled-rust-crate-pam-saslauthd \
bundled-rust-crate-pkg-config \
pam-saslauthd"

RDEPENDS:${PN} += "cyrus-sasl-saslauthd \
libc.so.6 \
libgcc-s.so.1 \
libpam.so.0"

inherit rpm
