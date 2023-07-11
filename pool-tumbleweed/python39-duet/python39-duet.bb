SUMMARY = "A simple future-based async library for python"
DESCRIPTION = "A simple future-based async library for python."
LICENSE = "Apache-2.0"

PV = "0.2.8"

RPM_NAME = "python39-duet-0.2.8-1.3.noarch.rpm"
RPM_HASH = "5541631893d770e90fecdfb5b446976ad6442f759577a819d902d286a4d109b963f77c76d9bface0e4e7457c0d08197389459aa96a76b49a496019a2b388a6ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-duet \
python39-duet \
python3dist-duet"

RDEPENDS:${PN} += "python-abi \
python39-typing-extensions"

inherit rpm
