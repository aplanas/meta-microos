SUMMARY = "Immutable wrapper around dictionaries (a fork of frozendict)"
DESCRIPTION = "A fork of the original frozendict, an immutable wrapper around dictionaries. This library is a pure Python, MIT-licensed alternative to the new LGPL-3.0 licensed frozendict. \
 \
It implements the complete mapping interface and can be used as a drop-in replacement for dictionaries where immutability is desired. The immutabledict constructor mimics dict, and all of the expected interfaces (iter, len, repr, hash, getitem) are provided. Note that an immutabledict does not guarantee the immutability of its values, so the utility of hash method is restricted by usage. \
 \
The only difference is that the copy() method of immutable takes variable keyword arguments, which will be present as key/value pairs in the new, immutable copy."
LICENSE = "MIT"

PV = "2.2.5"

RPM_NAME = "python39-immutabledict-2.2.5-1.1.noarch.rpm"
RPM_HASH = "f5ed98bf98cc184ccd97aad742391a094f66a2d6da7a7004d8551cddfa2174d191c45619900dba267bc29befb1486a48baa358c8adf20b418325e8a485d77065"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-immutabledict \
python39-immutabledict \
python3dist-immutabledict"

RDEPENDS:${PN} += "python-abi"

inherit rpm
