SUMMARY = "File watching and code reload in python"
DESCRIPTION = "A package for file watching and code reload in python. \
 \
This package was previously named 'watchgod'."
LICENSE = "MIT"

PV = "0.19.0"

RPM_NAME = "python310-watchfiles-0.19.0-1.2.aarch64.rpm"
RPM_HASH = "7a5148f90e2418c31b2a3a81a218e71045cc4abc5c3bc7c4673b18177ed09989e44a4a38eeee8c3fa08757e45e4737898055a70dd1c018d9b456bd0a2986467e"

RPROVIDES:${PN} += "python3.10dist-watchfiles \
python310-watchfiles \
python3dist-watchfiles"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
libc.so.6 \
libgcc-s.so.1 \
python-abi \
python310-anyio \
update-alternatives"

inherit rpm
