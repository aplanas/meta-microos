SUMMARY = "Development files for libspf"
DESCRIPTION = "The libspf2-devel package contains the header files and static \
libraries necessary for developing programs using the libspf2 (Sender \
Policy Framework) library. \
 \
If you want to develop programs that will look up and process SPF records, \
you should install libspf2-devel. \
 \
API documentation is in the separate libspf2-apidocs package."
LICENSE = "BSD-2-Clause | LGPL-2.1-or-later"

PV = "1.2.11"

RPM_NAME = "libspf2-devel-1.2.11-6.14.aarch64.rpm"
RPM_HASH = "cacdb2843c3c020248a5b176f6d3faea24f1cedcad33dd24f9cb0cce9ed064d8579a0aa6c666e162fe0e5aa9077a7a5ed5b773991f3a81e326f959f3599ae0f7"

RPROVIDES:${PN} += "libspf2-devel"

RDEPENDS:${PN} += "libspf2-2"

inherit rpm
