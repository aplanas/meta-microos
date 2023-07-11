SUMMARY = "A pam module to authenticated saslauthd as a provider"
DESCRIPTION = "A pam module that allows authentication to saslauthd as a provider. This only provides authentication \
not authorisation so you MUST not use this as a complete auth provider."
LICENSE = "MPL-2.0"

PV = "0.1.0~3"

RPM_NAME = "pam_saslauthd-0.1.0~3-1.3.aarch64.rpm"
RPM_HASH = "e2fd221756efd859ce3416f030b0d2542e167cbc270d07729e522b8bc23dda99459f33117c851d7880f2b4d4f33053d3a385a3a8233f44ee4e854bf298645db7"

RPROVIDES:${PN} += "bundled-rust-crate-libc \
bundled-rust-crate-pam-saslauthd \
bundled-rust-crate-pkg-config \
pam-saslauthd"

RDEPENDS:${PN} += "cyrus-sasl-saslauthd \
libc.so.6 \
libgcc-s.so.1 \
libpam.so.0"

inherit rpm
