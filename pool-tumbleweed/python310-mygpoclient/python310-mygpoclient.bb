SUMMARY = "Python gpodder.net API Client Library"
DESCRIPTION = "The mygpoclient library allows developers to utilize a Pythonic interface to \
the my.gpodder.org web services."
LICENSE = "GPL-3.0-or-later"

PV = "1.9"

RPM_NAME = "python310-mygpoclient-1.9-1.4.noarch.rpm"
RPM_HASH = "9ea0356b8e704a593862e500d6ea2b40497641de3ae3bb9d99c2967d483addcc485dfa4ab6ed9e9f092ad3b17348faba704a6b8eb1117eb593c9e20517f611e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mygpoclient \
python3.10dist-mygpoclient \
python310-mygpoclient \
python3dist-mygpoclient"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-simplejson \
update-alternatives"

inherit rpm
