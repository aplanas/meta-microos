SUMMARY = "Recurrent neural network for audio noise reduction - Development Files"
DESCRIPTION = "RNNoise is a noise suppression library based on a recurrent neural network. \
 \
This package holds the development files."
LICENSE = "BSD-3-Clause"

PV = "0.git20210122.1cbdbcf"

RPM_NAME = "rnnoise-devel-0.git20210122.1cbdbcf-1.9.aarch64.rpm"
RPM_HASH = "4a3a82b58e20ff5870bbf32d817b65abc964cc1f08f91709e6211605e5794c912c76fd9a729978dfdb2206e7eaa4ca1ed357e5e141066c8e42775309d464333f"

RPROVIDES:${PN} += "pkgconfig-rnnoise \
rnnoise-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librnnoise0"

inherit rpm
