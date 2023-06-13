SUMMARY = "Documentation for OpenStack middleware library"
DESCRIPTION = "Oslo middleware library includes components that can be injected into wsgi \
pipelines to intercept request/response flows. The base class can be enhanced \
with functionality like add/delete/modification of http headers and support \
for limiting size/connection etc. \
This package contains the documentation."
LICENSE = "Apache-2.0"

PV = "5.1.1"

RPM_NAME = "python3-oslo.middleware-doc-5.1.1-1.2.noarch.rpm"
RPM_HASH = "9189541570bd403b17b4c90e02add054d17a7318a1208e8f8f102f7f0fd5edfdb0d5e70ca6e684b451fa7dc1b7c446ab4adfbdaf16e734b64cba1ed3896d839a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.middleware-doc"

RDEPENDS:${PN} += ""

inherit rpm
