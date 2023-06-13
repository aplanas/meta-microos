SUMMARY = "Python framework independent HTTP protocol utils"
DESCRIPTION = "httptools is a Python binding for the nodejs HTTP parser."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python310-httptools-0.5.0-2.1.aarch64.rpm"
RPM_HASH = "8e9fcd4ad5cea7a212948cbe6e6fc9b68f05c9d6cf6ee79a480a72e086ef7139b10c5ff7e177dd69aafbb9fa9c049940d7207313ed3a25f986f6ac6faf2ce09b"

RPROVIDES:${PN} += "python3-httptools \
python3.10dist(httptools) \
python310-httptools \
python310-httptools(aarch-64) \
python3dist(httptools)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
