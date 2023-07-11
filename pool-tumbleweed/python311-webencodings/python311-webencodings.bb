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

RPM_NAME = "python311-webencodings-0.5.1-5.2.noarch.rpm"
RPM_HASH = "78d52b6e9d1378fcc1c127a26c588b904e3430143e7a56ed9819b0ed658fd693da95f4415da60e0852158e7e7485c919b792a37134fe40183a16b7aa69d3c6e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-webencodings \
python3.11dist-webencodings \
python311-webencodings \
python3dist-webencodings"

RDEPENDS:${PN} += "python-abi"

inherit rpm
