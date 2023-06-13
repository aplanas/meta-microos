SUMMARY = "File watching and code reload in python"
DESCRIPTION = "A package for file watching and code reload in python. \
 \
This package was previously named 'watchgod'."
LICENSE = "MIT"

PV = "0.19.0"

RPM_NAME = "python310-watchfiles-0.19.0-1.1.aarch64.rpm"
RPM_HASH = "194558d08d8532cb78dba3c4e78c1f6f0c0be2faf6220211ab4ac5d015e4c1b20eaf20e6efabecfe45d1d83c0020d14d3ad5d006413e80577c53acc646e8d03b"

RPROVIDES:${PN} += "python3-watchfiles \
python3.10dist(watchfiles) \
python310-watchfiles \
python310-watchfiles(aarch-64) \
python3dist(watchfiles)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
python(abi) \
python310-anyio \
update-alternatives"

inherit rpm
