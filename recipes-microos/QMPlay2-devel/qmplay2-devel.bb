SUMMARY = "QMPlay2 development files"
DESCRIPTION = "It's a development package for QMPlay2."
LICENSE = "LGPL-3.0-or-later"

PV = "23.02.05"

RPM_NAME = "QMPlay2-devel-23.02.05-6.2.noarch.rpm"
RPM_HASH = "42d241edd04c86a688dbbf2d0308a8552cf022a5025a01ac89f2edfd182f95c4e6dfe2e414ea4589cc7e24ea6e36446c703c0975e4dfff0bb4ae3d2471b9093b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "QMPlay2-devel"
RDEPENDS:${PN} += "QMPlay2"

inherit rpm
