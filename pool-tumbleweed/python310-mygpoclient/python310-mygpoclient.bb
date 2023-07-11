SUMMARY = "Python gpodder.net API Client Library"
DESCRIPTION = "The mygpoclient library allows developers to utilize a Pythonic interface to \
the my.gpodder.org web services."
LICENSE = "GPL-3.0-or-later"

PV = "1.9"

RPM_NAME = "python310-mygpoclient-1.9-1.5.noarch.rpm"
RPM_HASH = "e858c04c95beb801de6425b7e74654813f66eb9cd6eea5ab9945cb04725463cc9b02f77fddb74347f2877108ac07bf127f03e57e53c12d6beac162827e0050af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mygpoclient \
python310-mygpoclient \
python3dist-mygpoclient"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-simplejson \
update-alternatives"

inherit rpm
