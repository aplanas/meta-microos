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

RPM_NAME = "libspf2-devel-1.2.11-6.13.aarch64.rpm"
RPM_HASH = "18ecf79f6b8adc6f729ac3107a54e92bed8acf0d9abfd9c0184be9172e910582e787f9eef880314d1173708f0a9403d813fc1200666ec9af019b648c86bc5be7"

RPROVIDES:${PN} += "libspf2-devel"

RDEPENDS:${PN} += "libspf2-2"

inherit rpm
