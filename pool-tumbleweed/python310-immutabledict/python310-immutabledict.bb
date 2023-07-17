SUMMARY = "Immutable wrapper around dictionaries (a fork of frozendict)"
DESCRIPTION = "A fork of the original frozendict, an immutable wrapper around dictionaries. This library is a pure Python, MIT-licensed alternative to the new LGPL-3.0 licensed frozendict. \
 \
It implements the complete mapping interface and can be used as a drop-in replacement for dictionaries where immutability is desired. The immutabledict constructor mimics dict, and all of the expected interfaces (iter, len, repr, hash, getitem) are provided. Note that an immutabledict does not guarantee the immutability of its values, so the utility of hash method is restricted by usage. \
 \
The only difference is that the copy() method of immutable takes variable keyword arguments, which will be present as key/value pairs in the new, immutable copy."
LICENSE = "MIT"

PV = "2.2.5"

RPM_NAME = "python310-immutabledict-2.2.5-2.1.noarch.rpm"
RPM_HASH = "732f551bc54aebd0e04256056cd71cf32f87e53a0f7bd29fdc59a90b70772f20af02f40b01fcc0ee3a2c7c090d4e7ad2d97db9af4cb1fdbac2ca676ba0c59083"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-immutabledict \
python310-immutabledict \
python3dist-immutabledict"

RDEPENDS:${PN} += "python-abi"

inherit rpm
