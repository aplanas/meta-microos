SUMMARY = "Headers for support library required by Pocketsphinx"
DESCRIPTION = "devel files for sphinxbase5-5~git20220609.617e536 \
 \
CMU Sphinx toolkit is a speech recognition tool and has a number of packages for \
different tasks and applications."
LICENSE = "BSD-2-Clause & MIT"

PV = "5~git20220609.617e536"

RPM_NAME = "sphinxbase5-devel-5~git20220609.617e536-1.4.aarch64.rpm"
RPM_HASH = "98580cdcdfc0db043a0b2b3ca6d8ed88c934912be422bfa6f6b4559e9548d5da74f59e694c947bca40ead59873301962a8d8b3be8c1030ebf81f5140a54e1383"

RPROVIDES:${PN} += "pkgconfig(sphinxbase) \
sphinxbase5-devel \
sphinxbase5-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
alsa-devel \
lapack-devel \
libsndfile-devel \
libsphinxbase3 \
sphinxbase5"

inherit rpm
