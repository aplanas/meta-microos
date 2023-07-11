SUMMARY = "Development package for kdgantt2"
DESCRIPTION = "The development package for the kdgantt2 libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "16.08.3"

RPM_NAME = "kdgantt2-devel-16.08.3-4.17.aarch64.rpm"
RPM_HASH = "8a3de766723ef5b037cd7842ab02859a5a1c219ba8c59226243f60fa0559ead9adf755e92dd1c3087bc0de6fa7c714b17c2ce7d9b3942a65a06bf640c4edc5dc"

RPROVIDES:${PN} += "cmake-KF5KDGantt2 \
kdgantt2-devel"

RDEPENDS:${PN} += "libKF5KDGantt2-5"

inherit rpm
