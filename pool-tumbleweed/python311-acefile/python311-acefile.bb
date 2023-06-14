SUMMARY = "ACE 1.0 and 2.0 archive reader/extractor in pure Python"
DESCRIPTION = "Read/test/extract ACE 1.0 and 2.0 archives in pure python."
LICENSE = "BSD-2-Clause"

PV = "0.6.12"

RPM_NAME = "python311-acefile-0.6.12-3.16.aarch64.rpm"
RPM_HASH = "332258c447b2bd0f228881ad43d2e56f20e91bfb5aa9238dde29e9c6f8a261b27783b93772d421ad173e4d712dc314657c555c43e8092a10496430a88469c16a"

RPROVIDES:${PN} += "python3.11dist-acefile \
python311-acefile \
python3dist-acefile"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
