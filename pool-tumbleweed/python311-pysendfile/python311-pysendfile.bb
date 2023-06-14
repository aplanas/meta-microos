SUMMARY = "A Python interface to sendfile(2)"
DESCRIPTION = "A python interface to sendfile(2) system call."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python311-pysendfile-2.0.1-3.1.aarch64.rpm"
RPM_HASH = "997c8e36e8042bd7e6bbd769f03830f4320219027f52dc54f34459c410c6e336ac58ee6d92171a10cc8f901c196c277610020d6643a53de9cb478f2febd33f3e"

RPROVIDES:${PN} += "python3.11dist-pysendfile \
python311-pysendfile \
python3dist-pysendfile"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
