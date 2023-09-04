SUMMARY = "Python Version Management"
DESCRIPTION = "pyenv lets the user switch between multiple versions of Python. \
 \
This project was forked from rbenv and ruby-build, and modified for Python."
LICENSE = "MIT"

PV = "2.3.25"

RPM_NAME = "pyenv-2.3.25-1.1.aarch64.rpm"
RPM_HASH = "abfad63d7db13c7fafd153ae8ed5e3c97cb52c1ff2cf7705ffc7cd589505f861c3db381bd4752c9560c9401e0798b18a30635aec61582a194d189c62431234fd"

RPROVIDES:${PN} += "config-pyenv \
pyenv"

RDEPENDS:${PN} += "/usr/bin/bash \
libc.so.6"

inherit rpm
