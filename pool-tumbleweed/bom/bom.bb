SUMMARY = "Deals with Unicode byte order marks"
DESCRIPTION = "bom is a simple UNIX command line utility for dealing with Unicode byte \
order marks (BOM's). \
 \
Unicode byte order marks are 'magic number' byte sequences that sometimes \
appear at the beginning of a file to indicate the file's character \
encoding. They're sometimes helpful but usually they're just annoying."
LICENSE = "Apache-2.0"

PV = "1.0.1"

RPM_NAME = "bom-1.0.1-1.8.aarch64.rpm"
RPM_HASH = "d6ce8f019bed71e1bbe0e757a39d5798210a2a99b8a7c9adf5484c03d7fe13bcf8c57841217560e9ff77fb773a8c9761215a9c3c3e0b2415abf30284a47ff739"

RPROVIDES:${PN} += "bom"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
