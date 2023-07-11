SUMMARY = "Pytest plugin for coverage reporting"
DESCRIPTION = "Hunter is a flexible code tracing toolkit, not for measuring coverage, \
but for debugging, logging, inspection and other nefarious purposes."
LICENSE = "BSD-2-Clause"

PV = "3.5.1"

RPM_NAME = "python39-hunter-3.5.1-1.7.aarch64.rpm"
RPM_HASH = "258ad55f5216a28058d7f6d8a1830b8452186752d88ef478a51b9ff3d21355aa6967bab8969f0db66ff86b74b60f6258006c8013e148d8737ad6bc46cf6d54b0"

RPROVIDES:${PN} += "python3.9dist-hunter \
python39-hunter \
python3dist-hunter"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
update-alternatives"

inherit rpm
