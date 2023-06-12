SUMMARY = "Python framework independent HTTP protocol utils"
DESCRIPTION = "httptools is a Python binding for the nodejs HTTP parser."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python39-httptools-0.5.0-2.1.aarch64.rpm"
RPM_HASH = "e30c9d9e99c7f4dee9996d19e102ef28381eff6663dcbd862bc1b763d95f100e835acf29b784a7cc9d26eddf1bd7038342c7a50ebf2aa04e41b0d907833f6eb4"

RPROVIDES:${PN} += "python3.9dist(httptools) \
python39-httptools \
python39-httptools(aarch-64) \
python3dist(httptools)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
