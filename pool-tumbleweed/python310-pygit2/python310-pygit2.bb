SUMMARY = "Python bindings for libgit2"
DESCRIPTION = "Bindings for libgit2, a linkable C library for the Git version-control system."
LICENSE = "GPL-2.0-only"

PV = "1.12.2"

RPM_NAME = "python310-pygit2-1.12.2-1.1.aarch64.rpm"
RPM_HASH = "71b5963dea072adbaecc6a3b3b9ab44a87962ff3f200e88006a6da190722c60560bc8b97892abc649896bd0b7546bfd5c3f11ec3d12470fbe4f21d07d08ca67d"

RPROVIDES:${PN} += "python3.10dist-pygit2 \
python310-pygit2 \
python3dist-pygit2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgit2.so.1.7 \
python-abi \
python310-cached-property \
python310-cffi"

inherit rpm
