SUMMARY = "CLI interface for RepRap"
DESCRIPTION = "Pronsole is a featured command line G-code sender. \
It controls the ReRap printer and integrates skeinforge. \
It is a part of Printrun."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0~rc7.1599393390.c451359"

RPM_NAME = "pronsole-2.0.0~rc7.1599393390.c451359-3.13.noarch.rpm"
RPM_HASH = "6a67461a14121bab8ee4637ec0c6747891fc865f7694d80524b5e42260b6b1545a20933eb99e02fdbb7f03f49b82b8d297b25843ec2330c9ad36b64c63a83ebf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pronsole"

RDEPENDS:${PN} += "/usr/bin/python3 \
Printrun-common"

inherit rpm
