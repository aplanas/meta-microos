SUMMARY = "Python gpodder.net API Client Library"
DESCRIPTION = "The mygpoclient library allows developers to utilize a Pythonic interface to \
the my.gpodder.org web services."
LICENSE = "GPL-3.0-or-later"

PV = "1.9"

RPM_NAME = "python311-mygpoclient-1.9-1.4.noarch.rpm"
RPM_HASH = "82a6f941d87bd538dcb07fdf59f9340552cb604aa328956d370f81ff18e9edeeb3fdc0df4fc8988dfcf4f7b13f0601c8a68e6dea7069d73e7a1c566e95f1d488"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-mygpoclient \
python311-mygpoclient \
python3dist-mygpoclient"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-simplejson \
update-alternatives"

inherit rpm
