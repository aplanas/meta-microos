SUMMARY = "Library to access the File Vault Drive Encryption format"
DESCRIPTION = "libfvde is a library to access the File Vault Drive Encryption format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20220915"

RPM_NAME = "python39-libfvde-20220915-3.15.aarch64.rpm"
RPM_HASH = "f28a45cf82e8bbc7f886db802012f3122d4ed6554b75ff73c09f26b35d916f29213cea1e9d0f0b7f2c73fa8f131f5baf54cbb3dd7fb1e33af4a9faa4658fa4ab"

RPROVIDES:${PN} += "python39-libfvde"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libfvde.so.1 \
python-abi"

inherit rpm
