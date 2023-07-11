SUMMARY = "A Python interface to sendfile(2)"
DESCRIPTION = "A python interface to sendfile(2) system call."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python311-pysendfile-2.0.1-3.3.aarch64.rpm"
RPM_HASH = "27ffe37f9f7fc57a477803f73e95ac4496ba1282f8ffb950c8c2031c2e7a20d39a0544e56f42ad27d44f3987c09fa79407c7c25daa614baa22b28b41f1f81e29"

RPROVIDES:${PN} += "python3-pysendfile \
python3.11dist-pysendfile \
python311-pysendfile \
python3dist-pysendfile"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
