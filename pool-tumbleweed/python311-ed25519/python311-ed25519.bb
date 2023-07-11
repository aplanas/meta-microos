SUMMARY = "Python bindings to the Ed25519 public-key signature system"
DESCRIPTION = "Python bindings to the Ed25519 public-key signature system."
LICENSE = "MIT"

PV = "1.5"

RPM_NAME = "python311-ed25519-1.5-3.13.aarch64.rpm"
RPM_HASH = "6ecf38b66c165b6d2b74ffa540bc849b5212c051990b53604fac9a95bcbdbdaa6c70e76c2042722e5c32d76ac5323bfd6dfa0ea8d2aade325aa977ac23c484ca"

RPROVIDES:${PN} += "python3-ed25519 \
python3.11dist-ed25519 \
python311-ed25519 \
python3dist-ed25519"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
update-alternatives"

inherit rpm
