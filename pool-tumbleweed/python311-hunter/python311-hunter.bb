SUMMARY = "Pytest plugin for coverage reporting"
DESCRIPTION = "Hunter is a flexible code tracing toolkit, not for measuring coverage, \
but for debugging, logging, inspection and other nefarious purposes."
LICENSE = "BSD-2-Clause"

PV = "3.5.1"

RPM_NAME = "python311-hunter-3.5.1-1.5.aarch64.rpm"
RPM_HASH = "f5941e42bbf7de78be92f8008cab25bd1081bf55973c056002c945fc07138c4bc65087ee62ee4059f128dff42f7c1e896c04214754207e5f5f4110bed3887c49"

RPROVIDES:${PN} += "python3.11dist-hunter \
python311-hunter \
python3dist-hunter"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
update-alternatives"

inherit rpm
