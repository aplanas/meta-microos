SUMMARY = "Immutable wrapper around dictionaries (a fork of frozendict)"
DESCRIPTION = "A fork of the original frozendict, an immutable wrapper around dictionaries. This library is a pure Python, MIT-licensed alternative to the new LGPL-3.0 licensed frozendict. \
 \
It implements the complete mapping interface and can be used as a drop-in replacement for dictionaries where immutability is desired. The immutabledict constructor mimics dict, and all of the expected interfaces (iter, len, repr, hash, getitem) are provided. Note that an immutabledict does not guarantee the immutability of its values, so the utility of hash method is restricted by usage. \
 \
The only difference is that the copy() method of immutable takes variable keyword arguments, which will be present as key/value pairs in the new, immutable copy."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python311-immutabledict-3.0.0-1.1.noarch.rpm"
RPM_HASH = "f72df2d47e842e502c32dd682afd41e83a796ca7e5d21b3660c54d3df694e1ae1248204149f14cce35a077e1d7efabf8aecda54bd614d1044be5196ba88f633b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-immutabledict \
python3.11dist-immutabledict \
python311-immutabledict \
python3dist-immutabledict"

RDEPENDS:${PN} += "python-abi"

inherit rpm
