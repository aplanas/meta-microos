SUMMARY = "Minimal bindings to GitHub's fork of cmark"
DESCRIPTION = "Minimal bindings to GitHub's fork of cmark"
LICENSE = "MIT"

PV = "2022.10.27"

RPM_NAME = "python39-cmarkgfm-2022.10.27-2.3.aarch64.rpm"
RPM_HASH = "a5e0dfea1681eaf00207ed38678d8b141409c196bd1f0a56d228c621fd5d392f55497e37f32b4d4062f19f2f376d80e6e3f2c0f983728b71c54a2805bc1d92fc"

RPROVIDES:${PN} += "python3.9dist-cmarkgfm \
python39-cmarkgfm \
python3dist-cmarkgfm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-cffi"

inherit rpm
