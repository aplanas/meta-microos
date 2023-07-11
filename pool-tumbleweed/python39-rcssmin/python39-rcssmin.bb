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

RPM_NAME = "python39-rcssmin-1.1.1-2.1.aarch64.rpm"
RPM_HASH = "5e4b16fd10b72804266b90ce248fff9e98d6e92e5629bfac7f4d256535bfb327b0fec43c727dc63af9c7fd5bf04a2eabd139a5fe38f37bad89cc762a5901122d"

RPROVIDES:${PN} += "python3.9dist-rcssmin \
python39-rcssmin \
python3dist-rcssmin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
