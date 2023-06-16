SUMMARY = "Python gpodder.net API Client Library"
DESCRIPTION = "The mygpoclient library allows developers to utilize a Pythonic interface to \
the my.gpodder.org web services."
LICENSE = "GPL-3.0-or-later"

PV = "1.9"

RPM_NAME = "python39-mygpoclient-1.9-1.4.noarch.rpm"
RPM_HASH = "c3f5fc2563e10458d8363b8b6d5eef15a42ce7b4e7e087c298a59662499b6afd2e72f31ac134e29d6d8462d058868bf69adf3ee0f2f485e499579ef5644fd1b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mygpoclient \
python39-mygpoclient \
python3dist-mygpoclient"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-simplejson \
update-alternatives"

inherit rpm
