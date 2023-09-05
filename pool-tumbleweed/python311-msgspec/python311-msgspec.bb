SUMMARY = "A fast serialization and validation library"
DESCRIPTION = "A fast serialization and validation library, with builtin support for JSON, MessagePack, YAML, and TOML."
LICENSE = "BSD-3-Clause"

PV = "0.18.2"

RPM_NAME = "python311-msgspec-0.18.2-1.1.aarch64.rpm"
RPM_HASH = "4f60b9ce49b72bc8567ede039d6156d3dbb53d3929a8d1adb5da49f0a5f5187faeda15db494158a8e0370187dfbb2edaf36ec57eb164f53faf182f4de0cd1280"

RPROVIDES:${PN} += "python3-msgspec \
python3.11dist-msgspec \
python311-msgspec \
python3dist-msgspec"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
