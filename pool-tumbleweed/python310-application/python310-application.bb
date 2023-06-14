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

RPM_NAME = "python310-application-3.0.3-2.10.aarch64.rpm"
RPM_HASH = "8b34dc4dc6c09f51233cd4f3b87359a452bd338ac34d4da011c7eaa24f5fa97fd6906faf5b1452792ea8ade4babe4f23213be3be48c1e222c1a249c19555dbb9"

RPROVIDES:${PN} += "python3-application \
python3.10dist-python3-application \
python310-application \
python3dist-python3-application"

RDEPENDS:${PN} += "python-abi"

inherit rpm
