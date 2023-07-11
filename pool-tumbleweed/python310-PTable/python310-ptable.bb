SUMMARY = "Python library for displaying data as tabular ASCII"
DESCRIPTION = "Python library for displaying tabular data in an ASCII table format."
LICENSE = "BSD-3-Clause"

PV = "0.9.2"

RPM_NAME = "python310-PTable-0.9.2-2.12.noarch.rpm"
RPM_HASH = "840507c06658a0bed1ac2a9d29db55cde4ec0ba1402a3a2e701953b11e66eccba8993783480628c6d796d24dcb2529ceabfa7e9f460b328cb8c6509e86bf503e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ptable \
python310-PTable \
python3dist-ptable"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi"

inherit rpm
