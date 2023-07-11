SUMMARY = "Python FFI toolkit using clang"
DESCRIPTION = "Python FFI toolkit using clang."
LICENSE = "MIT"

PV = "2.3.4"

RPM_NAME = "python3-ctypeslib2-2.3.4-1.2.noarch.rpm"
RPM_HASH = "a06c1c6c86af7c25725f8827b34416691c01c03d1e3af08388d5ae686ee9e827961a49fc5f293864e91e32775ac1a4b722604461a14bc4861084aa761badc990"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ctypeslib2 \
python3.11dist-ctypeslib2 \
python311-ctypeslib2 \
python3dist-ctypeslib2"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3-clang15 \
update-alternatives"

inherit rpm
