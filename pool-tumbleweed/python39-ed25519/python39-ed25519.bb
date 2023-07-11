SUMMARY = "Python bindings to the Ed25519 public-key signature system"
DESCRIPTION = "Python bindings to the Ed25519 public-key signature system."
LICENSE = "MIT"

PV = "1.5"

RPM_NAME = "python39-ed25519-1.5-3.13.aarch64.rpm"
RPM_HASH = "fefe34ba6cf739827813c58fe63362ee45621f6dd508d9db47aeece6fb6d5e1be69339f11ea2416e7f7aababb4f08c9a1a9e7f6cef28b41600ba05bc9c38a42e"

RPROVIDES:${PN} += "python3.9dist-ed25519 \
python39-ed25519 \
python3dist-ed25519"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
update-alternatives"

inherit rpm
