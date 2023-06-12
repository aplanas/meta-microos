SUMMARY = "OpenStack oslo.middleware library"
DESCRIPTION = "Oslo middleware library includes components that can be injected into wsgi \
pipelines to intercept request/response flows. The base class can be enhanced \
with functionality like add/delete/modification of http headers and support \
for limiting size/connection etc. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "5.1.1"

RPM_NAME = "python3-oslo.middleware-5.1.1-1.2.noarch.rpm"
RPM_HASH = "b7eaf344b39783b91f3bee3b5ae4ed73b3ee5e1129e06ebc890db1750748736baa2549f5b2dda84213093e50ccdece470035388f0bc4b9ee225e48d9b5875bc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.middleware \
python3.10dist(oslo.middleware) \
python3dist(oslo.middleware)"
RDEPENDS:${PN} += "python(abi) \
python3-Jinja2 \
python3-WebOb \
python3-bcrypt \
python3-debtcollector \
python3-oslo.config \
python3-oslo.context \
python3-oslo.i18n \
python3-oslo.serialization \
python3-oslo.utils \
python3-statsd \
python3-stevedore"

inherit rpm
