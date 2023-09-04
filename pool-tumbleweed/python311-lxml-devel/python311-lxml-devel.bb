SUMMARY = "Development files for python-lxml"
DESCRIPTION = "lxml is a Pythonic binding for the libxml2 and libxslt libraries. It \
provides convenient access to these libraries using the ElementTree \
API. It extends the ElementTree API significantly to offer support for XPath, \
RelaxNG, XML Schema, XSLT and C14N. \
 \
This package contains header files needed to use lxml's C API."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.9.3"

RPM_NAME = "python311-lxml-devel-4.9.3-1.1.aarch64.rpm"
RPM_HASH = "8d494ff2adc0d1eea22e828d58f3ea288db82f7eacba66499a4dc8bdc53f27acda25f6146a111c765a7ca04150eec54c887233fd2836295b0993953ec2a2de10"

RPROVIDES:${PN} += "python3-lxml-devel \
python311-lxml-devel"

RDEPENDS:${PN} += "python311-lxml"

inherit rpm
