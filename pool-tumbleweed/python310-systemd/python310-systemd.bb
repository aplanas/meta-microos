SUMMARY = "Python wrappers for systemd functionality"
DESCRIPTION = "Python module for native access to the systemd facilities. Functionality is seperated into a number of modules: \
* systemd.journal supports sending of structured messages to the journal and reading journal files, \
* systemd.daemon wraps parts of libsystemd useful for writing daemons and socket activation, \
* systemd.id128 provides functions for querying machine and boot identifiers and a lists of message identifiers provided by systemd, \
* systemd.login wraps parts of libsystemd used to query logged in users and available seats and machines."
LICENSE = "LGPL-2.1-or-later"

PV = "235"

RPM_NAME = "python310-systemd-235-2.10.aarch64.rpm"
RPM_HASH = "270b4fe5142eebc83d7b0dd3d189a16f5a33bda749f1cfe48c71919b8c29cc9c6923a84340a1c7c3da13185ed0a453bb31ed0e56a00c30ea498877ca93f65e17"

RPROVIDES:${PN} += "python3-systemd \
python3.10dist-systemd-python \
python310-systemd \
python3dist-systemd-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0 \
python-abi \
systemd"

inherit rpm
