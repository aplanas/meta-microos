SUMMARY = "Immutable wrapper around dictionaries (a fork of frozendict)"
DESCRIPTION = "A fork of the original frozendict, an immutable wrapper around dictionaries. This library is a pure Python, MIT-licensed alternative to the new LGPL-3.0 licensed frozendict. \
 \
It implements the complete mapping interface and can be used as a drop-in replacement for dictionaries where immutability is desired. The immutabledict constructor mimics dict, and all of the expected interfaces (iter, len, repr, hash, getitem) are provided. Note that an immutabledict does not guarantee the immutability of its values, so the utility of hash method is restricted by usage. \
 \
The only difference is that the copy() method of immutable takes variable keyword arguments, which will be present as key/value pairs in the new, immutable copy."
LICENSE = "MIT"

PV = "2.2.5"

RPM_NAME = "python310-immutabledict-2.2.5-1.1.noarch.rpm"
RPM_HASH = "2c59d929a99f3716a3da8108b0b6f989d82ff2c0d68135108c9aa316f00135ec6d10c1a71bc25bb2ffd2cf7e33c5a8ce635502a6b3d3fba5221561f590cbb6ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-immutabledict \
python310-immutabledict \
python3dist-immutabledict"

RDEPENDS:${PN} += "python-abi"

inherit rpm
