SUMMARY = "File watching and code reload in python"
DESCRIPTION = "A package for file watching and code reload in python. \
 \
This package was previously named 'watchgod'."
LICENSE = "MIT"

PV = "0.19.0"

RPM_NAME = "python39-watchfiles-0.19.0-1.1.aarch64.rpm"
RPM_HASH = "f1c153aa401b3b7aa8cce5d3193f3b4dc884c7060f3e811127070d36ad4e95d60e83d7e018d626cfa6db2f1859e34c481a5cac1daa70177840ad76adc5e23e90"

RPROVIDES:${PN} += "python3.9dist-watchfiles \
python39-watchfiles \
python3dist-watchfiles"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
libc.so.6 \
libgcc-s.so.1 \
python-abi \
python39-anyio \
update-alternatives"

inherit rpm
