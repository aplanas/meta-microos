SUMMARY = "Python wrappers for systemd functionality"
DESCRIPTION = "Python module for native access to the systemd facilities. Functionality is seperated into a number of modules: \
* systemd.journal supports sending of structured messages to the journal and reading journal files, \
* systemd.daemon wraps parts of libsystemd useful for writing daemons and socket activation, \
* systemd.id128 provides functions for querying machine and boot identifiers and a lists of message identifiers provided by systemd, \
* systemd.login wraps parts of libsystemd used to query logged in users and available seats and machines."
LICENSE = "LGPL-2.1-or-later"

PV = "235"

RPM_NAME = "python39-systemd-235-2.10.aarch64.rpm"
RPM_HASH = "d44d04aaabb18742f8d6b5fdc5cd159e348d89a3a49ff2d374701b251bd8ffd1c54f5dda520b4b76ebe09be37f1acfdb76305a460f0b03bb6b979bc87b1f19c2"

RPROVIDES:${PN} += "python3.9dist-systemd-python \
python39-systemd \
python3dist-systemd-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0 \
python-abi \
systemd"

inherit rpm
