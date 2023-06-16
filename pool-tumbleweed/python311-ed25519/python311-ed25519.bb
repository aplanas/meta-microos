SUMMARY = "Python bindings to the Ed25519 public-key signature system"
DESCRIPTION = "Python bindings to the Ed25519 public-key signature system."
LICENSE = "MIT"

PV = "1.5"

RPM_NAME = "python311-ed25519-1.5-3.11.aarch64.rpm"
RPM_HASH = "7576a50e9f59c5f093ca2448212e213b4c8b1d6bb95fb9f9e1c5d11606c8fd0c6d209ad5e32a6a24cd043b4ab06601fe09022cf2898c556d07b77b99dc2bd83e"

RPROVIDES:${PN} += "python3.11dist-ed25519 \
python311-ed25519 \
python3dist-ed25519"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
update-alternatives"

inherit rpm
