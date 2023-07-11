SUMMARY = "Development files for RNP"
DESCRIPTION = "RNP is a set of OpenPGP (RFC4880) tools, an alternative to GnuPG. \
This package contains the files needed to build against librnp."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause"

PV = "0.17.0"

RPM_NAME = "rnp-devel-0.17.0-4.1.aarch64.rpm"
RPM_HASH = "480ac7b4594e81ed8685dcbbbdc49f30a5cc158bef141c8e43d68513f6c4958c20d7a53a6a3feaec34f9d13fce15702d294664b669c79c2dc1362da82afc8955"

RPROVIDES:${PN} += "cmake-rnp \
pkgconfig-librnp \
rnp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librnp0"

inherit rpm
