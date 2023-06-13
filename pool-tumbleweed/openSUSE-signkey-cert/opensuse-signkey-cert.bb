SUMMARY = "Certificate for openSUSE KMP signing key"
DESCRIPTION = "This package includes the certificate of openSUSE signing key for signing \
kernel module file (.ko) in openSUSE KMP. This package also calls mokutil \
to help user to enroll certificate to MOK. Then kernel module in openSUSE \
KMP can be verified by kernel."
LICENSE = "GPL-2.0-or-later"

PV = "20220613"

RPM_NAME = "openSUSE-signkey-cert-20220613-2.6.aarch64.rpm"
RPM_HASH = "f1c6564463b81900723eb4d1c389bd90e6ddbc1db25cd19c708ae94a5a0a76149e6fd4cce1c81a45f80c9dabe785150fab5455b25907d5994aa1b417a1df35f8"

RPROVIDES:${PN} += "openSUSE-signkey-cert \
openSUSE-signkey-cert(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
mokutil"

inherit rpm
