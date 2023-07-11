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

RPM_NAME = "python311-application-3.0.3-2.11.aarch64.rpm"
RPM_HASH = "2f07764dd2fda813d8ba728e59681e513972cd6a987ad723894e00600162b57807fed8aface55f53eaa15a54ab652b4930bf3f03856e6d459856a1207fcce829"

RPROVIDES:${PN} += "python3-application \
python3.11dist-python3-application \
python311-application \
python3dist-python3-application"

RDEPENDS:${PN} += "python-abi"

inherit rpm
