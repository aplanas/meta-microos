SUMMARY = "GNU Crypto"
DESCRIPTION = "GNU Crypto provides implementations of cryptographic primitives and \
tools in the Java programming language for use by programmers and \
end-users."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.1"

RPM_NAME = "gnu-crypto-2.0.1-260.16.noarch.rpm"
RPM_HASH = "b1df06079654dde5eb2067af97da34185e8c2271c2c675b04668128e4054e33f548e2dc7470c0f69ab7089d02d66da207c4bbd0b0ccef6dfc70750aedaf426b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnu-crypto \
jce"

RDEPENDS:${PN} += ""

inherit rpm
