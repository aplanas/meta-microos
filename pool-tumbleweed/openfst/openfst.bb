SUMMARY = "Weighted finite-state transducer library"
DESCRIPTION = "OpenFst is a library for constructing, combining, optimizing and \
searching weighted finite-state transducers (FSTs)."
LICENSE = "Apache-2.0"

PV = "1.8.2"

RPM_NAME = "openfst-1.8.2-1.2.aarch64.rpm"
RPM_HASH = "9ecc9c9c281f2d207ec6403ab070bd9cb786269b0f53aa302866e3cddd5c3ee1e8e4c1ece7e18a61c69c9e22059c85a4efc38fb2129e93a3463c9c18eab57f32"

RPROVIDES:${PN} += "openfst"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfst.so.25 \
libfstscript.so.25 \
libstdc++.so.6"

inherit rpm
