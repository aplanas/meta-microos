SUMMARY = "Pytest plugin for coverage reporting"
DESCRIPTION = "Hunter is a flexible code tracing toolkit, not for measuring coverage, \
but for debugging, logging, inspection and other nefarious purposes."
LICENSE = "BSD-2-Clause"

PV = "3.5.1"

RPM_NAME = "python310-hunter-3.5.1-1.7.aarch64.rpm"
RPM_HASH = "a100c7087110d93d3e6d1351b189e14f7b0ec46959278f238552c51e1161d8386f225a042bb36246f9dbfd78f06111875417013c7a766f2e86d1e861cd847b19"

RPROVIDES:${PN} += "python3.10dist-hunter \
python310-hunter \
python3dist-hunter"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
update-alternatives"

inherit rpm
