SUMMARY = "Development files for RNP"
DESCRIPTION = "RNP is a set of OpenPGP (RFC4880) tools, an alternative to GnuPG. \
This package contains the files needed to build against librnp."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause"

PV = "0.16.2"

RPM_NAME = "rnp-devel-0.16.2-1.5.aarch64.rpm"
RPM_HASH = "4bf3b49980b5ee077a57bb2480dfc9396e0c2e3dba5510b0ea4ec97a47d457817d58ac60dae2a1be4a9ac2d9ecd3593222a5f5d2e9bae0624cdd85279004deb2"

RPROVIDES:${PN} += "cmake(rnp) \
pkgconfig(librnp) \
rnp-devel \
rnp-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librnp0"

inherit rpm
