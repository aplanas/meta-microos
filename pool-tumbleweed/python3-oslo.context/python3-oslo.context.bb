SUMMARY = "OpenStack Oslo context library"
DESCRIPTION = "The Oslo context library has helpers to maintain useful information \
about a request context. \
The request context is usually populated in the WSGI pipeline and \
used by various modules such as logging. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "5.0.0"

RPM_NAME = "python3-oslo.context-5.0.0-1.5.noarch.rpm"
RPM_HASH = "8455dda4e24e12932955d505776bd08afb72bbe4e43e14a3c1851f5d7d68f87fca79b6e39364b8973e9bac7981b702bb65a273607886d789779b88f190f32ddd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.context \
python3.11dist-oslo.context \
python3dist-oslo.context"

RDEPENDS:${PN} += "python-abi \
python3-debtcollector"

inherit rpm
