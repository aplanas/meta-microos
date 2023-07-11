SUMMARY = "Python wrappers for systemd functionality"
DESCRIPTION = "Python module for native access to the systemd facilities. Functionality is seperated into a number of modules: \
* systemd.journal supports sending of structured messages to the journal and reading journal files, \
* systemd.daemon wraps parts of libsystemd useful for writing daemons and socket activation, \
* systemd.id128 provides functions for querying machine and boot identifiers and a lists of message identifiers provided by systemd, \
* systemd.login wraps parts of libsystemd used to query logged in users and available seats and machines."
LICENSE = "LGPL-2.1-or-later"

PV = "235"

RPM_NAME = "python39-systemd-235-3.3.aarch64.rpm"
RPM_HASH = "24c7183e6cff4af506f4876aaf6075811fb4b96080680c821bb7e97769924faa6c400329c9c8c85c522037ea7bb97ccbc36867339ea8220edd06923e5e0446ae"

RPROVIDES:${PN} += "python3.9dist-systemd-python \
python39-systemd \
python3dist-systemd-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0 \
python-abi \
systemd"

inherit rpm
