SUMMARY = "A python wrapper to libcangjie"
DESCRIPTION = "Python wrapper to libcangjie, the library implementing the Cangjie input method."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3"

RPM_NAME = "python310-cangjie-1.3-2.6.aarch64.rpm"
RPM_HASH = "e652a7c10952bc5c3e1ec9470f735be215d799e17b77ce2f8f6826c3e57366b90039ec1022be0aae76cdee67874e816932780a2e2a8ef92cc33715021982f880"

RPROVIDES:${PN} += "python310-cangjie"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcangjie-data \
libcangjie.so.2 \
python-abi"

inherit rpm
