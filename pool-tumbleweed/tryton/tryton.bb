SUMMARY = "The client of the Tryton application platform"
DESCRIPTION = "The client of the Tryton application platform. \
A three-tiers  high-level general purpose application platform \
written in Python and use Postgresql as database engine. \
It is the core base of an Open Source ERP. \
It provides modularity, scalability and security."
LICENSE = "GPL-3.0-or-later"

PV = "6.0.28"

RPM_NAME = "tryton-6.0.28-1.1.noarch.rpm"
RPM_HASH = "c09cf10b0aea11c018a1e3edc337835a587453b5663a6aee828c1bef99355d5d96c3c8115cb6c76c6208d5dfd4a9a0f283353bac179d93f51b20efd091dbaae3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-tryton \
python3dist-tryton \
tryton"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-GooCalendar \
python3-cairo \
python3-chardet \
python3-dateutil \
python3-gnupg \
python3-gobject \
python3-gobject-Gdk \
python3-gobject-cairo \
python3-pytz \
python3-setuptools \
python3-simplejson \
python3-xml"

inherit rpm
