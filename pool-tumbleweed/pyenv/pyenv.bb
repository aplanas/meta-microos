SUMMARY = "Python Version Management"
DESCRIPTION = "pyenv lets the user switch between multiple versions of Python. \
 \
This project was forked from rbenv and ruby-build, and modified for Python."
LICENSE = "MIT"

PV = "2.3.21"

RPM_NAME = "pyenv-2.3.21-1.1.aarch64.rpm"
RPM_HASH = "2d9ad6c3df0fe66d85e3922066c9e904b07bddf25b03bb3ce03e71d8297cc821af06c63160a5130209c9d90b7a8be8980a9882313608257252b57bc637e547d2"

RPROVIDES:${PN} += "config-pyenv \
pyenv"

RDEPENDS:${PN} += "/usr/bin/bash \
libc.so.6"

inherit rpm
