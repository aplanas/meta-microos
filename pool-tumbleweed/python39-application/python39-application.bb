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

RPM_NAME = "python39-application-3.0.3-2.10.aarch64.rpm"
RPM_HASH = "f09a37b9c72c519f0de949fbc68c369e475bf74c850796dd1d4fc645914442286299d4171f709d83ca0a45b3e001df2ac7d63d65e4064d4f8603d7f2e830fce0"

RPROVIDES:${PN} += "python3.9dist(python3-application) \
python39-application \
python39-application(aarch-64) \
python3dist(python3-application)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
