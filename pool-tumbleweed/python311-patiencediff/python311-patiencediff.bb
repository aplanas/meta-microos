SUMMARY = "Python implementation of the patiencediff algorithm"
DESCRIPTION = "Python implementation of the patiencediff algorithm."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.12"

RPM_NAME = "python311-patiencediff-0.2.12-1.6.aarch64.rpm"
RPM_HASH = "5ba12a6c8a2f68fc02fcb8c3857682a9c1b721f66f24c4dda68020d933937044938b47f57a63a05395252ba5c97e741f05ae3b191b05e4a70a93c0b19a4e0cf7"

RPROVIDES:${PN} += "python3-patiencediff \
python3.11dist-patiencediff \
python311-patiencediff \
python3dist-patiencediff"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
update-alternatives"

inherit rpm
