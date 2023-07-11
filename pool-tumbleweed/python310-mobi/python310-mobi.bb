SUMMARY = "Library for unpacking unencrypted mobi files"
DESCRIPTION = "Python library for unpacking unencrypted mobi files (forked from KindleUnpack)"
LICENSE = "GPL-3.0-only"

PV = "0.3.3"

RPM_NAME = "python310-mobi-0.3.3-1.5.noarch.rpm"
RPM_HASH = "1a7669c9396898d1cfb035624d87c300df89b6090d17b7a960995ef5753335b3f2b1d970cd7ddf1fae96432d921becc935c11b812bf380972f0f79f3350eb0c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mobi \
python310-mobi \
python3dist-mobi"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-loguru"

inherit rpm
