SUMMARY = "Yet Another JSON Library Tools"
DESCRIPTION = "YAJL is a small event-driven (SAX-style) JSON parser written in ANSI C, and a \
small validating JSON generator. \
 \
This package provides a few command-line utilities for processing JSON files."
LICENSE = "ISC"

PV = "2.1.0"

RPM_NAME = "yajl-2.1.0-7.2.aarch64.rpm"
RPM_HASH = "17e8ea01b13065f24b388a4e993f6ea9912059c63109565dfbbec5af15c37b18792357a01c59c114d86b89619ece98dd0e35e5ba1c9dd131ace9fb7210e0002e"

RPROVIDES:${PN} += "yajl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libyajl2"

inherit rpm
