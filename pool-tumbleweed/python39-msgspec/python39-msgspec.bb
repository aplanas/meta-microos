SUMMARY = "A fast serialization and validation library"
DESCRIPTION = "A fast serialization and validation library, with builtin support for JSON, MessagePack, YAML, and TOML."
LICENSE = "BSD-3-Clause"

PV = "0.18.2"

RPM_NAME = "python39-msgspec-0.18.2-1.1.aarch64.rpm"
RPM_HASH = "44332809ef2dfec885e80a53514b238d2644a5f4a7da28f9ca03f4c02af01dcffab2fa37ee152c1fa18e298bf971a48e37f3e49dcab9e4787165b938e7d5db16"

RPROVIDES:${PN} += "python3.9dist-msgspec \
python39-msgspec \
python3dist-msgspec"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
