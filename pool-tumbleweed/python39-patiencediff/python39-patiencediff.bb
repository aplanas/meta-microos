SUMMARY = "Python implementation of the patiencediff algorithm"
DESCRIPTION = "Python implementation of the patiencediff algorithm."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.12"

RPM_NAME = "python39-patiencediff-0.2.12-1.6.aarch64.rpm"
RPM_HASH = "f127060b32705145ffb81a3f83ec64c02e9d9b2c36d8466e520f8fca512a6681ce6bcee2a2fd635d390e08b08e69ca150fddbc42d4e54098d83236886be6bca0"

RPROVIDES:${PN} += "python3.9dist-patiencediff \
python39-patiencediff \
python3dist-patiencediff"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
update-alternatives"

inherit rpm
