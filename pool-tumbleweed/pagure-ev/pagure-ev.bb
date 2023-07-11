SUMMARY = "EventSource server for pagure"
DESCRIPTION = "Pagure comes with an eventsource server allowing live update of the pages \
supporting it. This package provides it."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.13.3"

RPM_NAME = "pagure-ev-5.13.3-1.5.noarch.rpm"
RPM_HASH = "c9fae445619d5d971d22ef89c6335a9abcc0f5f4c4b947c00956ad6556ade0f7ee9d528c20d715ddf200f7f2733c0e69a33221aacc0e4c698dbdb3ae86641539"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pagure-ev"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
pagure \
python3-Trololio \
systemd"

inherit rpm
