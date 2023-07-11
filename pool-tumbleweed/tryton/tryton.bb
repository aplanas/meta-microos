SUMMARY = "The client of the Tryton application platform"
DESCRIPTION = "The client of the Tryton application platform. \
A three-tiers  high-level general purpose application platform \
written in Python and use Postgresql as database engine. \
It is the core base of an Open Source ERP. \
It provides modularity, scalability and security."
LICENSE = "GPL-3.0-or-later"

PV = "6.0.27"

RPM_NAME = "tryton-6.0.27-1.2.noarch.rpm"
RPM_HASH = "9134df1b2d8986417e0ce7ca47418ae005cb1697cc834b4f4ab9c4ca66cb3025ed0eff0119183116988c74649a6067f2f3a0cb25e815cb94da0c6ba762a3b835"
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
