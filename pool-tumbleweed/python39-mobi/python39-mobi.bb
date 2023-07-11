SUMMARY = "Library for unpacking unencrypted mobi files"
DESCRIPTION = "Python library for unpacking unencrypted mobi files (forked from KindleUnpack)"
LICENSE = "GPL-3.0-only"

PV = "0.3.3"

RPM_NAME = "python39-mobi-0.3.3-1.5.noarch.rpm"
RPM_HASH = "77fae977906e9bd4255e47e2dd0a67377cc8bc0c98931c6271cd20fc76e8d6d43691b04307ad2cc8e0e4f602d096d7adac0187d56a56bc7a4ccac8e7b9ab2dc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mobi \
python39-mobi \
python3dist-mobi"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-loguru"

inherit rpm
