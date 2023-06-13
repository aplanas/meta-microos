SUMMARY = "Yet Another JSON Library (Static Library)"
DESCRIPTION = "YAJL is a small event-driven (SAX-style) JSON parser written in ANSI C, and a \
small validating JSON generator. \
 \
This package provides the necessary environment for linking statically \
against libyajl."
LICENSE = "ISC"

PV = "2.1.0"

RPM_NAME = "libyajl-devel-static-2.1.0-7.1.aarch64.rpm"
RPM_HASH = "118eda0430bee8c2104c67b15177795fab55f3bbacb77e1585c76ebeea808d51fb7a73135bda0a36c956506e3a484d400fa8d4be297d7b246f9d35aa42c2f2f6"

RPROVIDES:${PN} += "libyajl-devel-static \
libyajl-devel-static(aarch-64)"

RDEPENDS:${PN} += "libyajl-devel"

inherit rpm
