SUMMARY = "Python IDE for scientific computing"
DESCRIPTION = "Pyzo is a computing environment based on Python. Pyzo is a Python IDE \
aimed at interactivity, and consists of an editor, a shell, and a set \
of tools."
LICENSE = "BSD-3-Clause"

PV = "4.11.2"

RPM_NAME = "pyzo-4.11.2-1.14.noarch.rpm"
RPM_HASH = "5ab0088ff3c58cbf14ddab6ff3330fd02f9ea67679ef621f3c52b6305c38ef9b9320f5dc4498ae6a76427e4aaed21843b903d22d662f21ea1373fe18a7cc86c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pyzo"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
python3-pyzo"

inherit rpm
