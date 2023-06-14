SUMMARY = "Helsinki Finite-State Transducer Technology"
DESCRIPTION = "The Helsinki Finite-State Transducer software is intended for the \
implementation of morphological analyzers and other tools which are \
based on weighted and unweighted finite-state transducer technology."
LICENSE = "GPL-3.0-or-later & GPL-3.0-only & GPL-2.0-or-later & GPL-2.0-only & GPL-3.0-only & Apache-2.0"

PV = "3.15.4"

RPM_NAME = "hfst-3.15.4-1.3.aarch64.rpm"
RPM_HASH = "f58886e738e1fa0f03b3d640ba9b1f709ceb68617db394b812438207d38dffe33bca050fe23ebb01421355f27906d47280273c553bbedae9ca4edf984ddfb928"

RPROVIDES:${PN} += "hfst"

RDEPENDS:${PN} += "grep \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libhfst.so.53 \
libm.so.6 \
libreadline.so.8 \
libstdc++.so.6 \
sed"

inherit rpm
