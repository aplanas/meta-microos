SUMMARY = "Character encoding aliases for legacy web content"
DESCRIPTION = "This is a Python implementation of the WHATWG Encoding standard. \
 \
In order to be compatible with legacy web content when interpreting \
something like Content-Type: text/html; charset=latin1, tools need to \
use a particular set of aliases for encoding labels as well as some \
overriding rules. For example, US-ASCII and iso-8859-1 on the web are \
actually aliases for windows-1252, and an UTF-8 or UTF-16 BOM takes \
precedence over any other encoding declaration. The Encoding standard \
defines all such details so that implementations do not have to \
reverse-engineer each other. \
 \
This module has encoding labels and BOM detection, but the actual \
implementation for encoders and decoders is Python’s."
LICENSE = "BSD-3-Clause"

PV = "0.5.1"

RPM_NAME = "python39-webencodings-0.5.1-5.2.noarch.rpm"
RPM_HASH = "93e9f345543ee23053a6e1ea6c046d483838d5dfe67d469ab28e1320c52066bfb28efb53cc71107e474a38a25cd210d9bec05ea43b9dc62d3d2c853ddd87e6bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-webencodings \
python39-webencodings \
python3dist-webencodings"

RDEPENDS:${PN} += "python-abi"

inherit rpm
