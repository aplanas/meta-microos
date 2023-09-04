SUMMARY = "Immutable wrapper around dictionaries (a fork of frozendict)"
DESCRIPTION = "A fork of the original frozendict, an immutable wrapper around dictionaries. This library is a pure Python, MIT-licensed alternative to the new LGPL-3.0 licensed frozendict. \
 \
It implements the complete mapping interface and can be used as a drop-in replacement for dictionaries where immutability is desired. The immutabledict constructor mimics dict, and all of the expected interfaces (iter, len, repr, hash, getitem) are provided. Note that an immutabledict does not guarantee the immutability of its values, so the utility of hash method is restricted by usage. \
 \
The only difference is that the copy() method of immutable takes variable keyword arguments, which will be present as key/value pairs in the new, immutable copy."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python310-immutabledict-3.0.0-1.1.noarch.rpm"
RPM_HASH = "edac0abf05284024927d9e9f906d1b2357e0f3b523d5da654ad3891cb7b0604a158b400544d4c5f8d7ff649e84a436ef9446cac92eb6114a82f4d448c73ff408"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-immutabledict \
python310-immutabledict \
python3dist-immutabledict"

RDEPENDS:${PN} += "python-abi"

inherit rpm
