SUMMARY = "Python interface for c-ares"
DESCRIPTION = "pycares is a Python module which provides an interface to \
c-ares. c-ares is a C library that performs DNS requests and name \
resolutions asynchronously"
LICENSE = "MIT"

PV = "4.3.0"

RPM_NAME = "python310-pycares-4.3.0-2.1.aarch64.rpm"
RPM_HASH = "ca6771ebf2a9e41dd0e03466714fe8d22148402410e6bbd8611db1bf3ed6d7362b85795a3eb066d959d74d663363faa8108e530d375a64a1f427cf2ba17d663b"

RPROVIDES:${PN} += "python3-pycares \
python3.10dist-pycares \
python310-pycares \
python3dist-pycares"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-cffi"

inherit rpm
