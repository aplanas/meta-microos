SUMMARY = "Immutable wrapper around dictionaries (a fork of frozendict)"
DESCRIPTION = "A fork of the original frozendict, an immutable wrapper around dictionaries. This library is a pure Python, MIT-licensed alternative to the new LGPL-3.0 licensed frozendict. \
 \
It implements the complete mapping interface and can be used as a drop-in replacement for dictionaries where immutability is desired. The immutabledict constructor mimics dict, and all of the expected interfaces (iter, len, repr, hash, getitem) are provided. Note that an immutabledict does not guarantee the immutability of its values, so the utility of hash method is restricted by usage. \
 \
The only difference is that the copy() method of immutable takes variable keyword arguments, which will be present as key/value pairs in the new, immutable copy."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python39-immutabledict-3.0.0-1.1.noarch.rpm"
RPM_HASH = "703068895555b6cbd01ce05a758d984a99b95b2f3361ac368644c38288a8bdf099424dff74acd93900c2c8a5fd83386a7815ca214f8c089204b47e14aa985629"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-immutabledict \
python39-immutabledict \
python3dist-immutabledict"

RDEPENDS:${PN} += "python-abi"

inherit rpm
