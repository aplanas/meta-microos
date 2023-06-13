SUMMARY = "Python wrapper around SoX"
DESCRIPTION = "SOX is intended to be the Swiss Army knife of sound processing tools. \
It does many things, it just does not do them all well. Sooner or later \
it will come in very handy. SOX is really only usable day-to-day if you \
hide the wacky options with one-line shell scripts. \
 \
This is a Python wrapper for SOX."
LICENSE = "BSD-3-Clause"

PV = "1.4.1"

RPM_NAME = "python39-sox-1.4.1-1.14.noarch.rpm"
RPM_HASH = "67ffdeb024b07cd8ec3e50f0e0b78d3c35d89bd22fb1bf99d44faa518cc5e423b0eff8c73295a7185028a15bdcb77b3d5587a62412f747979c3c5e994a5392d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sox) \
python39-sox \
python3dist(sox)"

RDEPENDS:${PN} += "python(abi) \
sox"

inherit rpm
