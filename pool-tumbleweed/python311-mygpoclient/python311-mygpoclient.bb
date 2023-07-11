SUMMARY = "Python gpodder.net API Client Library"
DESCRIPTION = "The mygpoclient library allows developers to utilize a Pythonic interface to \
the my.gpodder.org web services."
LICENSE = "GPL-3.0-or-later"

PV = "1.9"

RPM_NAME = "python311-mygpoclient-1.9-1.5.noarch.rpm"
RPM_HASH = "0f1b025742f8eba7faae4e9f3bfe2f0931fe2cac3c2640ce0afde42dda08149f6ab966b5759f23129630877543dee0acbc505b5275da70a814ac89f884a7e415"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mygpoclient \
python3.11dist-mygpoclient \
python311-mygpoclient \
python3dist-mygpoclient"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-simplejson \
update-alternatives"

inherit rpm
