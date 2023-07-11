SUMMARY = "Filesystem events monitoring"
DESCRIPTION = "Python API and shell utilities to monitor file system events."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python39-watchdog-3.0.0-2.3.noarch.rpm"
RPM_HASH = "b81f98939d268c99c91f9bf0137e4490e41efef8da4aaf6b46b4041d88919543def30322389814419377b7bab7e72b178cf0dc4821a34cfd6f603927026a35f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-watchdog \
python39-watchdog \
python3dist-watchdog"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-PyYAML \
python39-pathtools \
update-alternatives"

inherit rpm
