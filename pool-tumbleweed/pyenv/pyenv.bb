SUMMARY = "Python Version Management"
DESCRIPTION = "pyenv lets the user switch between multiple versions of Python. \
 \
This project was forked from rbenv and ruby-build, and modified for Python."
LICENSE = "MIT"

PV = "2.3.22"

RPM_NAME = "pyenv-2.3.22-1.1.aarch64.rpm"
RPM_HASH = "5b8c2909a6dd26f0c19bbd4340f40aec690de8986e2b2f3a785ea5feef1ef4010f5d45011baa9d55466adac2411639810aff2470902e73045f46b00ca89c4ddc"

RPROVIDES:${PN} += "config-pyenv \
pyenv"

RDEPENDS:${PN} += "/usr/bin/bash \
libc.so.6"

inherit rpm
