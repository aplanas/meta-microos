SUMMARY = "Filesystem extended attributes for python"
DESCRIPTION = "This is a C extension module for Python which \
implements extended attributes manipulation. It is a wrapper on top \
of the attr C library - see attr(5)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7.2"

RPM_NAME = "python39-pyxattr-0.7.2-1.15.aarch64.rpm"
RPM_HASH = "6d5d284443331aa78ace136f1765d68ba5a47f55a692a4777a42fd404fad31612d21b310871a70d6961a0752d8c166b8f7ce001f3b1a98cf72ede2379f735cf5"

RPROVIDES:${PN} += "python3.9dist-pyxattr \
python39-pyxattr \
python3dist-pyxattr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
