SUMMARY = "Files for Developing with liblangtag"
DESCRIPTION = "liblangtag is an interface library to access tags for identifying \
languages. \
 \
This package contains the liblangtag development files."
LICENSE = "LGPL-3.0-or-later | MPL-2.0"

PV = "0.6.4"

RPM_NAME = "liblangtag-devel-0.6.4-1.1.aarch64.rpm"
RPM_HASH = "bef7e2cc6dd375625cbffa8bb49a63e423095821f0c0988aa1bdf443d3e87a2523c9a8929a299ef0b5b989187dae4e8a1e496d10d4af0655b372a7e072f5ab17"

RPROVIDES:${PN} += "liblangtag-devel \
pkgconfig-liblangtag"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblangtag1 \
pkgconfig-glib-2.0 \
pkgconfig-libxml-2.0"

inherit rpm
