SUMMARY = "A Python interface to sendfile(2)"
DESCRIPTION = "A python interface to sendfile(2) system call."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python310-pysendfile-2.0.1-3.1.aarch64.rpm"
RPM_HASH = "7b41ffe66092d992d5cef71f63119ffd90f32cd7ce91309ff0724535581b08c12c809618658198125b2fd75a9d38c36396ff9108a97a54cba5064c39cf9236cf"

RPROVIDES:${PN} += "python3-pysendfile \
python3.10dist-pysendfile \
python310-pysendfile \
python3dist-pysendfile"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
