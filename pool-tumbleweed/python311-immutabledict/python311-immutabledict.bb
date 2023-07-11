SUMMARY = "Immutable wrapper around dictionaries (a fork of frozendict)"
DESCRIPTION = "A fork of the original frozendict, an immutable wrapper around dictionaries. This library is a pure Python, MIT-licensed alternative to the new LGPL-3.0 licensed frozendict. \
 \
It implements the complete mapping interface and can be used as a drop-in replacement for dictionaries where immutability is desired. The immutabledict constructor mimics dict, and all of the expected interfaces (iter, len, repr, hash, getitem) are provided. Note that an immutabledict does not guarantee the immutability of its values, so the utility of hash method is restricted by usage. \
 \
The only difference is that the copy() method of immutable takes variable keyword arguments, which will be present as key/value pairs in the new, immutable copy."
LICENSE = "MIT"

PV = "2.2.5"

RPM_NAME = "python311-immutabledict-2.2.5-1.1.noarch.rpm"
RPM_HASH = "ebe94948a4a6f8d785ddfa8556f54674774b9f53057cd38c2f4fb529221c4bba24dda6c00e7b2533e549014c4268b7dda817b842c14bd0f447a624b927de9af8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-immutabledict \
python3.11dist-immutabledict \
python311-immutabledict \
python3dist-immutabledict"

RDEPENDS:${PN} += "python-abi"

inherit rpm
