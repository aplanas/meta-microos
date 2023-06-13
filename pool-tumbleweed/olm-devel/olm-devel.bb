SUMMARY = "Development files for olm"
DESCRIPTION = "An implementation of the Double Ratchet cryptographic ratchet \
in C and C++, including an implementation of the Megolm cryptographic ratchet. \
Development files for olm"
LICENSE = "Apache-2.0"

PV = "3.2.14"

RPM_NAME = "olm-devel-3.2.14-1.5.aarch64.rpm"
RPM_HASH = "5678ef28f9623b1dedd20e2499d284a3c97d45b04478eed43c7f183f80eca07269e70587f452fea916f3203ca3237311163b5df8b53e9f5a7fb8928b58f08395"

RPROVIDES:${PN} += "cmake(Olm) \
olm-devel \
olm-devel(aarch-64) \
pkgconfig(olm)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libolm3"

inherit rpm
