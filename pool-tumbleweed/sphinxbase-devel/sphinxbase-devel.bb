SUMMARY = "Headers for support library required by Pocketsphinx"
DESCRIPTION = "devel files for sphinxbase-0.8 \
 \
CMU Sphinx toolkit is a speech recognition tool and has a number of packages for \
different tasks and applications."
LICENSE = "BSD-2-Clause & MIT"

PV = "0.8"

RPM_NAME = "sphinxbase-devel-0.8-6.7.aarch64.rpm"
RPM_HASH = "1061bed138ba7a644dc40ef500dc66514334099412793a85d8b42e928eacee04523603b1fabe9c831087cdb56426aafd9e65f94a879a65fddb9a71484eaeb183"

RPROVIDES:${PN} += "pkgconfig-sphinxbase \
sphinxbase-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
alsa-devel \
lapack-devel \
libsndfile-devel \
libsphinxad0 \
libsphinxbase1"

inherit rpm
