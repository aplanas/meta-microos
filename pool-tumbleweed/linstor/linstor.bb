SUMMARY = "Binaries of linstor client"
DESCRIPTION = "Binaries of linstor client"
LICENSE = "GPL-3.0-only"

PV = "1.12.0"

RPM_NAME = "linstor-1.12.0-1.10.aarch64.rpm"
RPM_HASH = "3a1eda6c954bae6a5fe729b4311e857789511907959c1a07912fab7d7f61c82d42b31c423214ceb529735c1255d7aef548b654c71b59c05428da9f63736b3c26"

RPROVIDES:${PN} += "linstor"

RDEPENDS:${PN} += "/usr/bin/python3.10"

inherit rpm
