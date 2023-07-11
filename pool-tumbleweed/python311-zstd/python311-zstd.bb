SUMMARY = "ZSTD Bindings for Python"
DESCRIPTION = "ZSTD Bindings for Python."
LICENSE = "BSD-2-Clause"

PV = "1.5.5.1"

RPM_NAME = "python311-zstd-1.5.5.1-1.3.aarch64.rpm"
RPM_HASH = "0c88c514ffe5f69aa2f4e52be96d8641507c8b060495945aec679ac666b1ad142034fbe99baebb055b432327cd60c1fac1b9fd1e1af86709ef02ebd7742b197e"

RPROVIDES:${PN} += "python3-zstd \
python3.11dist-zstd \
python311-zstd \
python3dist-zstd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzstd.so.1 \
python-abi"

inherit rpm
