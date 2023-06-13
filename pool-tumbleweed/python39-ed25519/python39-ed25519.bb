SUMMARY = "Python bindings to the Ed25519 public-key signature system"
DESCRIPTION = "Python bindings to the Ed25519 public-key signature system."
LICENSE = "MIT"

PV = "1.5"

RPM_NAME = "python39-ed25519-1.5-3.11.aarch64.rpm"
RPM_HASH = "b4696572fcf2bef845055962a48bd1e047644dd2f1cf6b0de3ef264643a1df11b454b59b6e73f48a2dd3b14f6bbfcdaf375876b42aba2105af4832d121c7817e"

RPROVIDES:${PN} += "python3.9dist(ed25519) \
python39-ed25519 \
python39-ed25519(aarch-64) \
python3dist(ed25519)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
update-alternatives"

inherit rpm
