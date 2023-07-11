SUMMARY = "Headers for support library required by Pocketsphinx"
DESCRIPTION = "devel files for sphinxbase5-5~git20220609.617e536 \
 \
CMU Sphinx toolkit is a speech recognition tool and has a number of packages for \
different tasks and applications."
LICENSE = "BSD-2-Clause & MIT"

PV = "5~git20220609.617e536"

RPM_NAME = "sphinxbase5-devel-5~git20220609.617e536-1.5.aarch64.rpm"
RPM_HASH = "6ef064311b1484b53ba7b881150751fec25fec35c48b0456895a16826912931251ab355daac94ba4d5ea8fc75cb1586bf0ebb584886f9ab2443b7b380c69a264"

RPROVIDES:${PN} += "pkgconfig-sphinxbase \
sphinxbase5-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
alsa-devel \
lapack-devel \
libsndfile-devel \
libsphinxbase3 \
sphinxbase5"

inherit rpm
