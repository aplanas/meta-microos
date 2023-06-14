SUMMARY = "The client of the Tryton application platform"
DESCRIPTION = "The client of the Tryton application platform. \
A three-tiers  high-level general purpose application platform \
written in Python and use Postgresql as database engine. \
It is the core base of an Open Source ERP. \
It provides modularity, scalability and security."
LICENSE = "GPL-3.0-or-later"

PV = "6.0.27"

RPM_NAME = "tryton-6.0.27-1.1.noarch.rpm"
RPM_HASH = "b3320f550bc712a9073849efc5d99d978036cebde075eacd70a3bd14cf3afdd27ef60dfcf2175e55e13f7efe49f3850db73ccc4509f29b1e579353514f3c958a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-tryton \
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
