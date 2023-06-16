SUMMARY = "Slugify application that handles Unicode"
DESCRIPTION = "A Python Slugify application that handles Unicode."
LICENSE = "MIT"

PV = "5.0.2"

RPM_NAME = "python310-python-slugify-5.0.2-2.1.noarch.rpm"
RPM_HASH = "90685267c9846a4ed3b26a3a043ce00780f4d44324cfc2b2100375787401b39ca21cc7d8a43ee0ea1258a2fea23246b9aa544e341c54ceab49afa5fe5651f750"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-slugify \
python3.10dist-python-slugify \
python310-python-slugify \
python3dist-python-slugify"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-setuptools \
python310-text-unidecode \
update-alternatives"

inherit rpm
