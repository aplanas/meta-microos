SUMMARY = "Realtime Blacklist (RBL) service library"
DESCRIPTION = "This package provides librbl which is an interface \
to a facility to conduct Realtime Blacklist (RBL) \
queries and return their results.  RBLs are described in RFC5782."
LICENSE = "BSD-3-Clause"

PV = "2.11.0"

RPM_NAME = "librbl1-2.11.0-7.15.aarch64.rpm"
RPM_HASH = "65dd2442d525821516005521720d3e75a640798c3735f20defa7c245ed01fa34433b39cfd070c857fd38a9fa944ef82d384cbd3753f119025bf1d98cede5e979"

RPROVIDES:${PN} += "librbl.so.1()(64bit) \
librbl1 \
librbl1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
