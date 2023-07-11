SUMMARY = "Shared data files for the various gmic frontends"
DESCRIPTION = "This package contains shared data files for the various gmic frontends."
LICENSE = "CECILL-2.1"

PV = "3.2.6"

RPM_NAME = "gmic-data-3.2.6-1.1.noarch.rpm"
RPM_HASH = "db85261f643a1043f1c11a5c27c1e979129f097c2acc9ea52a536aaa92bbabb76a92f6e452925fe1a5b2281e8067566b98f6ccb735d41eb45dffcd5e8701d865"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gmic-data"

RDEPENDS:${PN} += ""

inherit rpm
