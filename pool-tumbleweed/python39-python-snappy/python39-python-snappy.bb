SUMMARY = "Python library for the snappy compression library"
DESCRIPTION = "Python library for the snappy compression library from Google."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "python39-python-snappy-0.6.1-1.5.aarch64.rpm"
RPM_HASH = "52cee8ce9787f16ea3ffa1b077d15d6e0b52a676c6d29976785470d7704ba60a9445bbad7a30884deaa7addaa6127b53a6fbe3c0e79ab21d6b6559be985296f2"

RPROVIDES:${PN} += "python3.9dist-python-snappy \
python39-python-snappy \
python3dist-python-snappy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsnappy.so.1 \
python-abi"

inherit rpm
