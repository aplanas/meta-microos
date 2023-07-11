SUMMARY = "RCSSmin is a CSS Minifier Written in Python"
DESCRIPTION = "rCSSmin is a CSS minifier written in python. \
 \
The minifier is based on the semantics of the YUI compressor, which \
itself is based on the rule list by Isaac Schlueter. \
 \
This module is a re-implementation aiming for speed instead of maximum \
compression, so it can be used at runtime (rather than during a \
preprocessing step). rCSSmin does syntactical compression only \
(removing spaces, comments and possibly semicolons). It does not \
provide semantic compression (like removing empty blocks, collapsing \
redundant properties etc). It does, however, support various CSS hacks \
(by keeping them working as intended)."
LICENSE = "Apache-2.0"

PV = "1.1.1"

RPM_NAME = "python310-rcssmin-1.1.1-2.1.aarch64.rpm"
RPM_HASH = "3f30e78dfcbde1226047496841733268baef30ca375c4b09b62ed39c1156cb0e6dfde6e60a0e7a1fb731dfce2d0b2a6bb4ec0cfc35a2cce51a108f424a9aaec5"

RPROVIDES:${PN} += "python3.10dist-rcssmin \
python310-rcssmin \
python3dist-rcssmin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
