SUMMARY = "Python wrapper around SoX"
DESCRIPTION = "SOX is intended to be the Swiss Army knife of sound processing tools. \
It does many things, it just does not do them all well. Sooner or later \
it will come in very handy. SOX is really only usable day-to-day if you \
hide the wacky options with one-line shell scripts. \
 \
This is a Python wrapper for SOX."
LICENSE = "BSD-3-Clause"

PV = "1.4.1"

RPM_NAME = "python310-sox-1.4.1-1.16.noarch.rpm"
RPM_HASH = "d9a4ac9fc0bdcc1a87f68982a910fe21cb6bc4ed250892f21babacc21aff0df55cdb84e8c221d9a62bcf353023492da3e079087725830cc2924cd0e75b52c34f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sox \
python310-sox \
python3dist-sox"

RDEPENDS:${PN} += "python-abi \
sox"

inherit rpm
