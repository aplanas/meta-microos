SUMMARY = "A libbytesize tool"
DESCRIPTION = "This package solely contains the bscalc tool."
LICENSE = "LGPL-2.1-only"

PV = "2.9"

RPM_NAME = "bscalc-2.9-1.1.noarch.rpm"
RPM_HASH = "7e95bff82547dc7518b97d70dbadf2166ccc3882fda75a93abd48c35509d36a429e455878ab89d45c6b556415013835f14f90970e6d1ba55b581869268bac70c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bscalc"

RDEPENDS:${PN} += "/usr/bin/python3 \
libbytesize1"

inherit rpm
