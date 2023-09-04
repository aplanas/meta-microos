SUMMARY = "Documentation files for python-flake8"
DESCRIPTION = "Flake8 is a modular extensible source code checker. \
 \
This package provides documentation for python-flake8."
LICENSE = "MIT"

PV = "6.1.0"

RPM_NAME = "python-flake8-doc-6.1.0-1.1.noarch.rpm"
RPM_HASH = "667b07a0956792d07417bb595526ea6d2c24e197cd0609f71129f61c6c2e3f11a19b0c768ae483ce8bb0a17b6652471aee6191ff4d9b10afc7279590337db2f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-flake8-doc"

RDEPENDS:${PN} += ""

inherit rpm
