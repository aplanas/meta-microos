SUMMARY = "An immutable dictionary"
DESCRIPTION = "frozendict is an immutable wrapper around dictionaries that implements the \
complete mapping interface. It can be used as a drop-in replacement for \
dictionaries where immutability is desired."
LICENSE = "MIT"

PV = "2.3.5"

RPM_NAME = "python310-frozendict-2.3.5-3.3.aarch64.rpm"
RPM_HASH = "8fc915c63d10f37dc768b5538a16d02d39265cd6d4739b10367517f4bc4c284b9bda7a300ea083bdd3ae8b9682ef824fcb017e8888f6f415484c1e787e5bb448"

RPROVIDES:${PN} += "python3.10dist-frozendict \
python310-frozendict \
python3dist-frozendict"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
