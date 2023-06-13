SUMMARY = "Python framework independent HTTP protocol utils"
DESCRIPTION = "httptools is a Python binding for the nodejs HTTP parser."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python311-httptools-0.5.0-2.1.aarch64.rpm"
RPM_HASH = "355af06e70bf2fe0c595d4ae1f62a7adbcbde57a9219305eb80f706d4d9da4195762ae1c50c9bf9f2a372d4b7b80a75cb1308b7ceb657eef3aedbd6213dea63f"

RPROVIDES:${PN} += "python3.11dist(httptools) \
python311-httptools \
python311-httptools(aarch-64) \
python3dist(httptools)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
