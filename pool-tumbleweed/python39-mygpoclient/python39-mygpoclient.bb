SUMMARY = "Python gpodder.net API Client Library"
DESCRIPTION = "The mygpoclient library allows developers to utilize a Pythonic interface to \
the my.gpodder.org web services."
LICENSE = "GPL-3.0-or-later"

PV = "1.9"

RPM_NAME = "python39-mygpoclient-1.9-1.5.noarch.rpm"
RPM_HASH = "d378c808124bd97bd855c433600c13ed070d0d89a8e7eba15aba30b5ebdb0b0f33c6ab99052c5a882cb69d26d68f1c98f25ed35ee43bc8b8cad3fbaf03c818ef"
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
