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

RPM_NAME = "python310-webencodings-0.5.1-5.2.noarch.rpm"
RPM_HASH = "d2a0561470378c24f362a43dbe404872446c77c04955d8c465822e3955b017145a71ec53e20f56e454b8ae15dc5533e06a421dc45a84bea9568786347b0796b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-webencodings \
python310-webencodings \
python3dist-webencodings"

RDEPENDS:${PN} += "python-abi"

inherit rpm
