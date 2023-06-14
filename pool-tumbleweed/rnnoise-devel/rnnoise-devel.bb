SUMMARY = "Recurrent neural network for audio noise reduction - Development Files"
DESCRIPTION = "RNNoise is a noise suppression library based on a recurrent neural network. \
 \
This package holds the development files."
LICENSE = "BSD-3-Clause"

PV = "0.git20210122.1cbdbcf"

RPM_NAME = "rnnoise-devel-0.git20210122.1cbdbcf-1.8.aarch64.rpm"
RPM_HASH = "93f561c09f7ce7304952f407ca6f399b91590e33a69c2127747758c9cfc9139c82979b0fb7445d145b151b87fb241922124aa931876950a9f44a51e0a11cefdb"

RPROVIDES:${PN} += "pkgconfig-rnnoise \
rnnoise-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librnnoise0"

inherit rpm
