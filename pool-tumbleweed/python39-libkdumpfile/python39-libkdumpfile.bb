SUMMARY = "Python interface for libkdumpfile"
DESCRIPTION = " \
 \
 \
 \
 \
This package contains all necessary python modules to use libkdumpfile via \
the Python interpreter."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.5.2"

RPM_NAME = "python39-libkdumpfile-0.5.2-1.1.aarch64.rpm"
RPM_HASH = "0c9c2632343fd3c6d400b0daad9762da2a1efebe0dfd02f25346e9eae1263ed7101094ac2cd249fcc873e53fa3cd125ace23d44cacc914386b572be9afb91a5f"

RPROVIDES:${PN} += "python3.9dist-libkdumpfile \
python39-libkdumpfile \
python3dist-libkdumpfile"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaddrxlat.so.3 \
libc.so.6 \
libkdumpfile.so.10 \
python-abi"

inherit rpm
