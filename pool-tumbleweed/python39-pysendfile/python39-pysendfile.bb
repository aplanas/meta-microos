SUMMARY = "A Python interface to sendfile(2)"
DESCRIPTION = "A python interface to sendfile(2) system call."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python39-pysendfile-2.0.1-3.1.aarch64.rpm"
RPM_HASH = "0559d32c90e4f54f18d9be7f09987a8d8221aee46e0318f65e466930590ec483e38de20d0fda34a68d0e271c6f65aed15315722105323bed1446514c65612d89"

RPROVIDES:${PN} += "python3.9dist-pysendfile \
python39-pysendfile \
python3dist-pysendfile"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
