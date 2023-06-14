SUMMARY = "Python wrapper around SoX"
DESCRIPTION = "SOX is intended to be the Swiss Army knife of sound processing tools. \
It does many things, it just does not do them all well. Sooner or later \
it will come in very handy. SOX is really only usable day-to-day if you \
hide the wacky options with one-line shell scripts. \
 \
This is a Python wrapper for SOX."
LICENSE = "BSD-3-Clause"

PV = "1.4.1"

RPM_NAME = "python310-sox-1.4.1-1.14.noarch.rpm"
RPM_HASH = "e05d5b6e7617c5468ff611d4a49253c90758e2305b2ae6047e8447ac844e0a0b16c639c4f56d8359c64804095d36a2771c82c481a7243fac168981a8ae8437ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sox \
python3.10dist-sox \
python310-sox \
python3dist-sox"

RDEPENDS:${PN} += "python-abi \
sox"

inherit rpm
