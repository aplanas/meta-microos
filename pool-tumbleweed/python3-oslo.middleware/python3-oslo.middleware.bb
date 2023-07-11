SUMMARY = "OpenStack oslo.middleware library"
DESCRIPTION = "Oslo middleware library includes components that can be injected into wsgi \
pipelines to intercept request/response flows. The base class can be enhanced \
with functionality like add/delete/modification of http headers and support \
for limiting size/connection etc. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "5.1.1"

RPM_NAME = "python3-oslo.middleware-5.1.1-1.3.noarch.rpm"
RPM_HASH = "69005ce4ad396479888c2be272b58648b28caadbdbf946c01eb6f84bcca952d0f0ba9192c52f4f5a29a663f9b98269387b853a8489695939e17e46b24d0df023"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.middleware \
python3.11dist-oslo.middleware \
python3dist-oslo.middleware"

RDEPENDS:${PN} += "python-abi \
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
