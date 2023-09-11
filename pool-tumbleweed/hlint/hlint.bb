SUMMARY = "Source code suggestions"
DESCRIPTION = "HLint gives suggestions on how to improve your source code."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "hlint-3.5-1.17.aarch64.rpm"
RPM_HASH = "3aa6db43a67ec8e37307880e323cec891c3759849967993220226d8005d52921427070a8b484582796b3b96536e0a1cab628c5a3aacc2998e58efc03d4a9638f"

RPROVIDES:${PN} += "hlint"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1 \
libyaml-0.so.2"

inherit rpm
