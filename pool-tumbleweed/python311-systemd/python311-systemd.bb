SUMMARY = "Python wrappers for systemd functionality"
DESCRIPTION = "Python module for native access to the systemd facilities. Functionality is seperated into a number of modules: \
* systemd.journal supports sending of structured messages to the journal and reading journal files, \
* systemd.daemon wraps parts of libsystemd useful for writing daemons and socket activation, \
* systemd.id128 provides functions for querying machine and boot identifiers and a lists of message identifiers provided by systemd, \
* systemd.login wraps parts of libsystemd used to query logged in users and available seats and machines."
LICENSE = "LGPL-2.1-or-later"

PV = "235"

RPM_NAME = "python311-systemd-235-3.3.aarch64.rpm"
RPM_HASH = "c29746b7821b51bb4999ff3315281c3e19cc81c34b6c77fcbc99a1f0a6dd347f5839fddd2de32001f2805a368f3a850d588782dd76a0d88f239254b2fc5af979"

RPROVIDES:${PN} += "python3-systemd \
python3.11dist-systemd-python \
python311-systemd \
python3dist-systemd-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0 \
python-abi \
systemd"

inherit rpm
