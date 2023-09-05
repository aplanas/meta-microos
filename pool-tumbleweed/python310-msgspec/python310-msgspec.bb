SUMMARY = "A fast serialization and validation library"
DESCRIPTION = "A fast serialization and validation library, with builtin support for JSON, MessagePack, YAML, and TOML."
LICENSE = "BSD-3-Clause"

PV = "0.18.2"

RPM_NAME = "python310-msgspec-0.18.2-1.1.aarch64.rpm"
RPM_HASH = "d618995a9ae1bef11c27f01e6fa2daff4390202e51f6d88967b77b164f58ca6d658a4cb533e004b3eab136b263713694d2ab283f17d573ff0b9a80a7d5ae1260"

RPROVIDES:${PN} += "python3.10dist-msgspec \
python310-msgspec \
python3dist-msgspec"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
