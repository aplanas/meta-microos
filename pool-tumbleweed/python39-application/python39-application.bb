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

RPM_NAME = "python39-application-3.0.3-2.11.aarch64.rpm"
RPM_HASH = "f91efd6353958a18fa86696d19d22305661e62104ef18d7d4c3adc0e66c3aa1c06d06d7f0fa914aea57af8103930cd58e0eb6d5e46a0cdd43357e77a59bf4ea3"

RPROVIDES:${PN} += "python3.9dist-python3-application \
python39-application \
python3dist-python3-application"

RDEPENDS:${PN} += "python-abi"

inherit rpm
