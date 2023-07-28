SUMMARY = "Yet Another JSON Library (Static Library)"
DESCRIPTION = "YAJL is a small event-driven (SAX-style) JSON parser written in ANSI C, and a \
small validating JSON generator. \
 \
This package provides the necessary environment for linking statically \
against libyajl."
LICENSE = "ISC"

PV = "2.1.0"

RPM_NAME = "libyajl-devel-static-2.1.0-8.1.aarch64.rpm"
RPM_HASH = "7c5acaea7393d9049e5a5a8110401f88cb1d6792575560dc5061300de8e047caa39b604fd01be1920fd16bc22ab96c134b552a50199a4cf01d368a3c66e4b5d5"

RPROVIDES:${PN} += "libyajl-devel-static"

RDEPENDS:${PN} += "libyajl-devel"

inherit rpm
