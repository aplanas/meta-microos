SUMMARY = "Library for unpacking unencrypted mobi files"
DESCRIPTION = "Python library for unpacking unencrypted mobi files (forked from KindleUnpack)"
LICENSE = "GPL-3.0-only"

PV = "0.3.3"

RPM_NAME = "python310-mobi-0.3.3-1.4.noarch.rpm"
RPM_HASH = "6e7b4c70482b20ab373c887f93e32496f055393debd247edfcc9fb8bade12773f56967b0b9c8f2556cf77b89cdc6097adbec8f10e86ed858320d3f20c272f556"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mobi \
python3.10dist(mobi) \
python310-mobi \
python3dist(mobi)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-loguru"

inherit rpm
