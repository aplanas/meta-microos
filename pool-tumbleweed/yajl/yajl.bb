SUMMARY = "Yet Another JSON Library Tools"
DESCRIPTION = "YAJL is a small event-driven (SAX-style) JSON parser written in ANSI C, and a \
small validating JSON generator. \
 \
This package provides a few command-line utilities for processing JSON files."
LICENSE = "ISC"

PV = "2.1.0"

RPM_NAME = "yajl-2.1.0-8.1.aarch64.rpm"
RPM_HASH = "809e61438d318f99d9e9171858973cf201687a1db9fe1c3a3b02ea8321c45d693b42dbed259f409feb3e959bb0346c3ec3e3c0ca34b626c00740ba0fa21f053d"

RPROVIDES:${PN} += "yajl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libyajl2"

inherit rpm
