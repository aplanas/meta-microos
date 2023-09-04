SUMMARY = "Library to access the File Vault Drive Encryption format"
DESCRIPTION = "libfvde is a library to access the File Vault Drive Encryption format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20220915"

RPM_NAME = "python310-libfvde-20220915-4.1.aarch64.rpm"
RPM_HASH = "9066f331b2f55b98ea7882b0f7ce68df9f21251ff70aaee50a0c3a648a65c36b95492193a6fa755a0871d623b475a58270e214447367d3ffed52d06bededa423"

RPROVIDES:${PN} += "python310-libfvde"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libfvde.so.1 \
python-abi"

inherit rpm
