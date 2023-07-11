SUMMARY = "Basic building blocks for Python applications"
DESCRIPTION = "This module provides some basic components that can be used to simplify \
building Python applications. \
 \
The components included by this package encapsulate the functionality to \
handle the following tasks: \
 \
 - UNIX process management (forking, signal handling, pid file creation) \
 - A very simple to use interface to handle .ini configuration files. \
 - An extensible system logger for console and/or syslog. \
 - Miscellaneous utilities and helpers. \
 - Memory troubleshooting and execution timing. \
 - Communicate inside the application using a notification system. \
 - Manage the version number for applications, modules and packages."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.3"

RPM_NAME = "python310-application-3.0.3-2.11.aarch64.rpm"
RPM_HASH = "b8f4c48d0bad72861d7d50b359b0bc4b2b0e4579228c8c056709b3ca43dd9d2154b437382b69932c3dd0096bdc7b6a0974062a3130b09e3ec249efd2dc779271"

RPROVIDES:${PN} += "python3.10dist-python3-application \
python310-application \
python3dist-python3-application"

RDEPENDS:${PN} += "python-abi"

inherit rpm
