SUMMARY = "Development files for python-lxml"
DESCRIPTION = "lxml is a Pythonic binding for the libxml2 and libxslt libraries. It \
provides convenient access to these libraries using the ElementTree \
API. It extends the ElementTree API significantly to offer support for XPath, \
RelaxNG, XML Schema, XSLT and C14N. \
 \
This package contains header files needed to use lxml's C API."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.9.2"

RPM_NAME = "python39-lxml-devel-4.9.2-7.1.aarch64.rpm"
RPM_HASH = "9aef635f0ceb289102cdcd41989acfb42e1dabeb55d4a163959603bfde01948a32587122c0ef15c3d49be25f60b0a20a41230b48736b481fea41e2b0620abd98"

RPROVIDES:${PN} += "python39-lxml-devel \
python39-lxml-devel(aarch-64)"

RDEPENDS:${PN} += "python39-lxml"

inherit rpm
