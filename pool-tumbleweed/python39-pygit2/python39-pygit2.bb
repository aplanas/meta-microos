SUMMARY = "Python bindings for libgit2"
DESCRIPTION = "Bindings for libgit2, a linkable C library for the Git version-control system."
LICENSE = "GPL-2.0-only"

PV = "1.12.2"

RPM_NAME = "python39-pygit2-1.12.2-1.1.aarch64.rpm"
RPM_HASH = "a2da739f21c4bac33c06ea5c658262ee419e6e23b033615601020da1f897f16fc6f59dcf51217d16cbb7a86812daef9156517a6dba87ce56fb4407d5f6f501f5"

RPROVIDES:${PN} += "python3.9dist-pygit2 \
python39-pygit2 \
python3dist-pygit2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgit2.so.1.7 \
python-abi \
python39-cached-property \
python39-cffi"

inherit rpm
