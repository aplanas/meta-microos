SUMMARY = "Libyui - REST API header files"
DESCRIPTION = "This package provides a libyui REST API plugin. \
 \
This is a development subpackage."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.6.0"

RPM_NAME = "libyui-rest-api-devel-4.6.0-1.1.aarch64.rpm"
RPM_HASH = "5fd2bfecf950908d50f5d7c1974dbf8b559148fa0746cbd65038e899973dcfac08e9c676ed09906bfdee34ff477ba3d8d9444113cbf800735313e06dfe040b71"

RPROVIDES:${PN} += "libyui-rest-api-devel \
libyui-rest-api-devel(aarch-64)"

RDEPENDS:${PN} += "boost-devel \
glibc-devel \
jsoncpp-devel \
libmicrohttpd-devel \
libstdc++-devel \
libyui-devel \
libyui-rest-api16"

inherit rpm
