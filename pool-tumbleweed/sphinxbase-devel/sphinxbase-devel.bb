SUMMARY = "Headers for support library required by Pocketsphinx"
DESCRIPTION = "devel files for sphinxbase-0.8 \
 \
CMU Sphinx toolkit is a speech recognition tool and has a number of packages for \
different tasks and applications."
LICENSE = "BSD-2-Clause & MIT"

PV = "0.8"

RPM_NAME = "sphinxbase-devel-0.8-6.6.aarch64.rpm"
RPM_HASH = "e0e6dcf761d2899877c104a42113f634444edb1bd233ca08adfa4b76892501b1083b18af960decdd9e1b4bd57e3a52d5cd4376cfcc28d31e24517ae6cfed02a9"

RPROVIDES:${PN} += "pkgconfig(sphinxbase) \
sphinxbase-devel \
sphinxbase-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
alsa-devel \
lapack-devel \
libsndfile-devel \
libsphinxad0 \
libsphinxbase1"

inherit rpm
