SUMMARY = "Python wrapper around SoX"
DESCRIPTION = "SOX is intended to be the Swiss Army knife of sound processing tools. \
It does many things, it just does not do them all well. Sooner or later \
it will come in very handy. SOX is really only usable day-to-day if you \
hide the wacky options with one-line shell scripts. \
 \
This is a Python wrapper for SOX."
LICENSE = "BSD-3-Clause"

PV = "1.4.1"

RPM_NAME = "python311-sox-1.4.1-1.16.noarch.rpm"
RPM_HASH = "9b48698c52732119c9b4701ebba21359aa6f0456f0058044fd83913d1960592efbda6a40e61b18a2a3714c9f9f34cd6a2d98ca01d23032739433bd6994d367c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sox \
python3.11dist-sox \
python311-sox \
python3dist-sox"

RDEPENDS:${PN} += "python-abi \
sox"

inherit rpm
