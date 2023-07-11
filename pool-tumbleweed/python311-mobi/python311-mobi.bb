SUMMARY = "Library for unpacking unencrypted mobi files"
DESCRIPTION = "Python library for unpacking unencrypted mobi files (forked from KindleUnpack)"
LICENSE = "GPL-3.0-only"

PV = "0.3.3"

RPM_NAME = "python311-mobi-0.3.3-1.5.noarch.rpm"
RPM_HASH = "ae6f8511b91b8993b78395d7aea0be84b9753e44743a9ae3e2d05ae319192aae1fa93edea1b61c4cf54094ca87f157666dcbc73827520c285cdd3fee5dd58497"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mobi \
python3.11dist-mobi \
python311-mobi \
python3dist-mobi"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-loguru"

inherit rpm
