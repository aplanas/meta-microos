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

RPM_NAME = "python310-rcssmin-1.1.1-1.4.aarch64.rpm"
RPM_HASH = "2e4a136dfc3fe9228a398632caee6effd35d21abb5203260b0613e5ca9d5542775cc48e12f5c840976449db55b04bbc0bb6e9f60adfa3c1a4d96b997389ec4bb"

RPROVIDES:${PN} += "python3-rcssmin \
python3.10dist-rcssmin \
python310-rcssmin \
python3dist-rcssmin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
