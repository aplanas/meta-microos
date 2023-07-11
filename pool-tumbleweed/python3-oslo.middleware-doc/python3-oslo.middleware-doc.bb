SUMMARY = "Documentation for OpenStack middleware library"
DESCRIPTION = "Oslo middleware library includes components that can be injected into wsgi \
pipelines to intercept request/response flows. The base class can be enhanced \
with functionality like add/delete/modification of http headers and support \
for limiting size/connection etc. \
This package contains the documentation."
LICENSE = "Apache-2.0"

PV = "5.1.1"

RPM_NAME = "python3-oslo.middleware-doc-5.1.1-1.3.noarch.rpm"
RPM_HASH = "f619baf3bcfe9a594348938d006eb390d212502e1db1008ab7291cce87bd9687fd8d02da16cb0b637dd06dff238db646edf9eccad7e985c3639574e1396dcd8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.middleware-doc"

RDEPENDS:${PN} += ""

inherit rpm
