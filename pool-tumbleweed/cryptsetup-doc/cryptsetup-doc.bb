SUMMARY = "Cryptsetup Documentation"
DESCRIPTION = "Documentation and man pages for cryptsetup"
LICENSE = "LGPL-2.0-or-later & SUSE-GPL-2.0-with-openssl-exception"

PV = "2.6.1"

RPM_NAME = "cryptsetup-doc-2.6.1-1.3.aarch64.rpm"
RPM_HASH = "c78f389ee19de9d5aebc31b0b320ae0e7b220e4dbd3441fafbe7bc5c3e9bc471f2c30d667a8cf305a82a581fa5376c20be516f29e3141d22c0222d876c2603c9"

RPROVIDES:${PN} += "cryptsetup-doc \
cryptsetup-doc(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
