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

RPM_NAME = "python311-application-3.0.3-2.10.aarch64.rpm"
RPM_HASH = "75b95d314ff145ab809db9a22338e682b48ac5ee7adac4fbce74cf2199a4a17804a19f657152006d08be7af4620637771cc400e95dd0d96ac430bc9875e7bd41"

RPROVIDES:${PN} += "python3.11dist(python3-application) \
python311-application \
python311-application(aarch-64) \
python3dist(python3-application)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
