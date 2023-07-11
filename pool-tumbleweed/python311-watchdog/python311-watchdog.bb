SUMMARY = "Filesystem events monitoring"
DESCRIPTION = "Python API and shell utilities to monitor file system events."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python311-watchdog-3.0.0-2.3.noarch.rpm"
RPM_HASH = "506921b656b2dc8ecb6d640ec7f891172746204532e8e396023d1ee47a37dbca8c73f63a6bcbd9d6e8870315b88fb8992443ab45cf5da48279d39b3c1fedc2f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-watchdog \
python3.11dist-watchdog \
python311-watchdog \
python3dist-watchdog"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-PyYAML \
python311-pathtools \
update-alternatives"

inherit rpm
