SUMMARY = "Minimal bindings to GitHub's fork of cmark"
DESCRIPTION = "Minimal bindings to GitHub's fork of cmark"
LICENSE = "MIT"

PV = "2022.10.27"

RPM_NAME = "python39-cmarkgfm-2022.10.27-2.1.aarch64.rpm"
RPM_HASH = "decea691a2b7b421e4b40a07aa15364a483e82d491489fe2d93b3e1042b10e605a1f4a00dd0dad9443d915be87eba91f996b98dee07d8cdb007952b0d28eaa72"

RPROVIDES:${PN} += "python3.9dist(cmarkgfm) \
python39-cmarkgfm \
python39-cmarkgfm(aarch-64) \
python3dist(cmarkgfm)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python39-cffi"

inherit rpm
