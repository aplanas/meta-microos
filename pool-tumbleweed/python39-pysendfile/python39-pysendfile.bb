SUMMARY = "A Python interface to sendfile(2)"
DESCRIPTION = "A python interface to sendfile(2) system call."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python39-pysendfile-2.0.1-3.3.aarch64.rpm"
RPM_HASH = "b80b51e6f5218bf3f4be5735e08859f3a566edf730480b6d8b95630ed83a71cfc85cf05c20adde7f8fbf5229d8fae0ac3512c00dde7daf6f6a6e22f00c4184bc"

RPROVIDES:${PN} += "python3.9dist-pysendfile \
python39-pysendfile \
python3dist-pysendfile"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
