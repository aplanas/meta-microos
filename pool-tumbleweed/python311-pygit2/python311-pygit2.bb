SUMMARY = "Python bindings for libgit2"
DESCRIPTION = "Bindings for libgit2, a linkable C library for the Git version-control system."
LICENSE = "GPL-2.0-only"

PV = "1.11.1"

RPM_NAME = "python311-pygit2-1.11.1-2.5.aarch64.rpm"
RPM_HASH = "a708c67dc60c8675fcc96be0305196cd7070470c2c835333e65ccc16b63745209a732d13a19edcc5d79daf586a916d7214605dd2ca79e5da04e7803f655b9ec5"

RPROVIDES:${PN} += "python3-pygit2 \
python3.11dist-pygit2 \
python311-pygit2 \
python3dist-pygit2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgit2.so.1.6 \
python-abi \
python311-cached-property \
python311-cffi"

inherit rpm
