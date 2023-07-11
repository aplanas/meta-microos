SUMMARY = "Web Toolkit - Development Files"
DESCRIPTION = "Development files for the Wt library. \
 \
Wt is a C++ library and application server for developping and \
deploying web applications. The widget-centric API is inspired by \
existing C++ GUI APIs. It offers complete abstraction of any \
web-specific implementation details.  Most imporantly, the entire \
application is written in only one compiled language (C++), from which \
the library generates the necessary HTML, Javascript, CGI, and AJAX \
code."
LICENSE = "GPL-2.0-only"

PV = "4.8.1"

RPM_NAME = "wt-devel-4.8.1-3.8.aarch64.rpm"
RPM_HASH = "708c17c456e4e7980edbe231bce5fe6eb45c23514c568c55bd97ed3c00e23c8c8a9b642ba4c5b0f0fdc486da1413ef36189274a455f68c2bdddd3d46564de605"

RPROVIDES:${PN} += "cmake-wt \
wt-devel"

RDEPENDS:${PN} += "FastCGI-devel \
Xerces-c-devel \
boost-devel \
cmake \
mxml-devel \
pkgconfig-openssl \
wt \
wt-dbo \
wt-dbo-mysql \
wt-dbo-postgres"

inherit rpm
