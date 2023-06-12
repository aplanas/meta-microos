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

RPM_NAME = "python310-webencodings-0.5.1-5.1.noarch.rpm"
RPM_HASH = "2b40dc2ebe77b1bc9a063c0ef0e5a371cc4fa2f6425ef2bc56ba936d8f6a232d30b4a8ce7db2d016d0df0735b1e737a0f69f64357618cc6f16f278291ed05940"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-webencodings \
python3.10dist(webencodings) \
python310-webencodings \
python3dist(webencodings)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
