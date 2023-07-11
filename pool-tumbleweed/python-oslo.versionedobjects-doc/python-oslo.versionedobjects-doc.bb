SUMMARY = "osloversionedobjects library - Documentation"
DESCRIPTION = "This package contains documentation files for python-oslo.versionedobjects."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "python-oslo.versionedobjects-doc-3.1.0-1.3.noarch.rpm"
RPM_HASH = "c5bd718f6c46191e6f06277f6342e60b641d49a8fd1b9c7aa16b781c02c30ed3c210c631c246e2c0224e667fa4bb2e5bae3601a0d60ffe551dcdecffcaba69de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.versionedobjects-doc"

RDEPENDS:${PN} += ""

inherit rpm
