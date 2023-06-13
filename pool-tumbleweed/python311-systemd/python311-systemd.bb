SUMMARY = "Python wrappers for systemd functionality"
DESCRIPTION = "Python module for native access to the systemd facilities. Functionality is seperated into a number of modules: \
* systemd.journal supports sending of structured messages to the journal and reading journal files, \
* systemd.daemon wraps parts of libsystemd useful for writing daemons and socket activation, \
* systemd.id128 provides functions for querying machine and boot identifiers and a lists of message identifiers provided by systemd, \
* systemd.login wraps parts of libsystemd used to query logged in users and available seats and machines."
LICENSE = "LGPL-2.1-or-later"

PV = "235"

RPM_NAME = "python311-systemd-235-2.10.aarch64.rpm"
RPM_HASH = "a22a90904d659b776149dae9ed8d42a7f57b9ac68a84aefd892f056dca504d59d8fdec1dc37c4bcc537cc075f7b8c3774a1b4a1362d9450e5e6d6eb6c79d41c5"

RPROVIDES:${PN} += "python3.11dist(systemd-python) \
python311-systemd \
python311-systemd(aarch-64) \
python3dist(systemd-python)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libsystemd.so.0(LIBSYSTEMD_214)(64bit) \
libsystemd.so.0(LIBSYSTEMD_219)(64bit) \
libsystemd.so.0(LIBSYSTEMD_227)(64bit) \
libsystemd.so.0(LIBSYSTEMD_229)(64bit) \
libsystemd.so.0(LIBSYSTEMD_230)(64bit) \
libsystemd.so.0(LIBSYSTEMD_233)(64bit) \
libsystemd.so.0(LIBSYSTEMD_245)(64bit) \
libsystemd.so.0(LIBSYSTEMD_246)(64bit) \
python(abi) \
systemd"

inherit rpm
