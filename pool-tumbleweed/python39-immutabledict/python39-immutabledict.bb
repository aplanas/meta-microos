SUMMARY = "Immutable wrapper around dictionaries (a fork of frozendict)"
DESCRIPTION = "A fork of the original frozendict, an immutable wrapper around dictionaries. This library is a pure Python, MIT-licensed alternative to the new LGPL-3.0 licensed frozendict. \
 \
It implements the complete mapping interface and can be used as a drop-in replacement for dictionaries where immutability is desired. The immutabledict constructor mimics dict, and all of the expected interfaces (iter, len, repr, hash, getitem) are provided. Note that an immutabledict does not guarantee the immutability of its values, so the utility of hash method is restricted by usage. \
 \
The only difference is that the copy() method of immutable takes variable keyword arguments, which will be present as key/value pairs in the new, immutable copy."
LICENSE = "MIT"

PV = "2.2.5"

RPM_NAME = "python39-immutabledict-2.2.5-2.1.noarch.rpm"
RPM_HASH = "3b8a589a1ff3bd3f261d0fffc041016ec0f2278669b6a7ed1a7ae7341619eb75532452ffa5664c5a1f826d3af691efab52dc6ce6fbb98ec56c89e856703f7031"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-immutabledict \
python39-immutabledict \
python3dist-immutabledict"

RDEPENDS:${PN} += "python-abi"

inherit rpm
