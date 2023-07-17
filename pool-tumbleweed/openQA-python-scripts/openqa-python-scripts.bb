SUMMARY = "Additional scripts in python"
DESCRIPTION = "Additional scripts for the use of openQA in the python programming language."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1689162874.c51d4b9"

RPM_NAME = "openQA-python-scripts-4.6.1689162874.c51d4b9-1.1.aarch64.rpm"
RPM_HASH = "79c5ac7952618b74b9897ef3af4572f7352cd6ac4acfb412cb98bb9019413cd689d6c44b6611de4571620f3722261f6c36150647b4b9173a5aa307c0643d9768"

RPROVIDES:${PN} += "openQA-python-scripts"

RDEPENDS:${PN} += "/usr/bin/python3 \
openQA-client \
python3-base \
python3-requests"

inherit rpm
