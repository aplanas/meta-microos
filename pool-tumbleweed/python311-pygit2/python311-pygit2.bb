SUMMARY = "Python bindings for libgit2"
DESCRIPTION = "Bindings for libgit2, a linkable C library for the Git version-control system."
LICENSE = "GPL-2.0-only"

PV = "1.12.2"

RPM_NAME = "python311-pygit2-1.12.2-1.1.aarch64.rpm"
RPM_HASH = "68bc3e88b944a2405c784d9f577ff417788abd1f9362694704b9348a4782ee7c3b0183ed6ae27d647703d88b77d421b9e52b449725798cde60490838c8d71600"

RPROVIDES:${PN} += "python3-pygit2 \
python3.11dist-pygit2 \
python311-pygit2 \
python3dist-pygit2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgit2.so.1.7 \
python-abi \
python311-cached-property \
python311-cffi"

inherit rpm
