SUMMARY = "Apache config file parser"
DESCRIPTION = "Apache / Config::General configuration file parser"
LICENSE = "BSD-2-Clause"

PV = "0.3.2"

RPM_NAME = "python311-apacheconfig-0.3.2-1.1.noarch.rpm"
RPM_HASH = "88cfa38967db962a86f8dd49ae767c260f3c9e20f9107583850d5805856c2b49e8a3a4dd57d3cc7c0330f836085928d3221afc52cc0ba60f1278848b2b659e0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-apacheconfig \
python3.11dist-apacheconfig \
python311-apacheconfig \
python3dist-apacheconfig"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-ply \
python311-six \
update-alternatives"

inherit rpm
