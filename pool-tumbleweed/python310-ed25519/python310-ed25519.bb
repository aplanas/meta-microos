SUMMARY = "Python bindings to the Ed25519 public-key signature system"
DESCRIPTION = "Python bindings to the Ed25519 public-key signature system."
LICENSE = "MIT"

PV = "1.5"

RPM_NAME = "python310-ed25519-1.5-3.11.aarch64.rpm"
RPM_HASH = "21f36fefafa05b6e85f8955b4a8330e639ab014936d684bcf9df1f02f94df0427aad67f3226b56754ee49838c2ea3fcfc739bdc38dd7e4eaca39e74d716b4223"

RPROVIDES:${PN} += "python3-ed25519 \
python3.10dist(ed25519) \
python310-ed25519 \
python310-ed25519(aarch-64) \
python3dist(ed25519)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
update-alternatives"

inherit rpm
