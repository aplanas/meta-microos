SUMMARY = "Development package for libgravatar"
DESCRIPTION = "The development package for the libgravatar library."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libgravatar-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "9b0d722a71be3d4748826b677cb449c63cc26d09c24aa2a0af70e3242662c9e62cdd5bfd85e559b50ba2093620dbfd549fb46455a112d960e2341d3ce45f53fd"

RPROVIDES:${PN} += "cmake-KPim5Gravatar \
libgravatar-devel"

RDEPENDS:${PN} += "libKPim5Gravatar5"

inherit rpm
