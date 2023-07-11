SUMMARY = "C-Bindings development files for adms"
DESCRIPTION = "This package contains all include files, libraries and configuration \
files needed to develop programs that use adms."
LICENSE = "GPL-3.0-only"

PV = "2.3.7"

RPM_NAME = "adms-devel-2.3.7-1.11.aarch64.rpm"
RPM_HASH = "10db50b37cdd7544e449d1805e6f1a87f802c1da88238347ee3ff53dfbd0a81d5b9998f943359cd68e0559d0f90830718cbe44bb4e7289b504c2177a30c4c3db"

RPROVIDES:${PN} += "adms-devel"

RDEPENDS:${PN} += "libadms0"

inherit rpm
