SUMMARY = "Header and object files for frr development"
DESCRIPTION = "The frr-devel package contains the header and object files necessary for \
developing OSPF-API and frr applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "8.4"

RPM_NAME = "frr-devel-8.4-4.2.aarch64.rpm"
RPM_HASH = "0a7bb26a38bd45234dbe506844870743eb2b0028b490805b89a8aa6d53ed254ec182b40a9125c7adaef047f5f468634d6566be531c35ab101aa8dadaee590daf"

RPROVIDES:${PN} += "frr-devel"

RDEPENDS:${PN} += "libfrr-pb0 \
libfrr0 \
libfrrcares0 \
libfrrfpm-pb0 \
libfrrospfapiclient0 \
libfrrsnmp0 \
libfrrzmq0 \
libmlag-pb0"

inherit rpm
