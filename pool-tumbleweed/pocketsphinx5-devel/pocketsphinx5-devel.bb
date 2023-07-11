SUMMARY = "Development files for pocketsphinx, a speech recognizer library"
DESCRIPTION = "CMU Sphinx toolkit has a number of packages for different tasks and \
applications. Pocketsphinx is a version of the open-source CMU Sphinx \
II speech recognition system which is able to recognize speech in \
real-time. \
 \
This is the development package for pocketsphinx."
LICENSE = "BSD-2-Clause"

PV = "5~git20200227.e40da77"

RPM_NAME = "pocketsphinx5-devel-5~git20200227.e40da77-2.4.aarch64.rpm"
RPM_HASH = "f4378c87ff1184161ee5f0c3e50b35d8964aa7c84283a95b65acb188bf638a3014a260204ad887a1b74d7d531ed8368553382d52b4bc57ece6dc702aa9aa948d"

RPROVIDES:${PN} += "pkgconfig-pocketsphinx \
pocketsphinx5-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-sphinxbase \
pocketsphinx5"

inherit rpm
