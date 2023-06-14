SUMMARY = "Development files for pocketsphinx, a speech recognizer library"
DESCRIPTION = "CMU Sphinx toolkit has a number of packages for different tasks and \
applications. Pocketsphinx is a version of the open-source CMU Sphinx \
II speech recognition system which is able to recognize speech in \
real-time. \
 \
This is the development package for pocketsphinx."
LICENSE = "BSD-2-Clause"

PV = "5~git20200227.e40da77"

RPM_NAME = "pocketsphinx5-devel-5~git20200227.e40da77-2.3.aarch64.rpm"
RPM_HASH = "282b65b175f6986ff2e2dcd1201b8762829ec9160c7994af1e4662290bcaa5ab807144410a79acfa7a6facc652fd1699bb8b0d481dd129355901b9483a601eac"

RPROVIDES:${PN} += "pkgconfig-pocketsphinx \
pocketsphinx5-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-sphinxbase \
pocketsphinx5"

inherit rpm
