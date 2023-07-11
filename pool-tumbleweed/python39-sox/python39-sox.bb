SUMMARY = "Python wrapper around SoX"
DESCRIPTION = "SOX is intended to be the Swiss Army knife of sound processing tools. \
It does many things, it just does not do them all well. Sooner or later \
it will come in very handy. SOX is really only usable day-to-day if you \
hide the wacky options with one-line shell scripts. \
 \
This is a Python wrapper for SOX."
LICENSE = "BSD-3-Clause"

PV = "1.4.1"

RPM_NAME = "python39-sox-1.4.1-1.16.noarch.rpm"
RPM_HASH = "fdfd8ce5663ed569085d055ccafcf042c660dd99014359671440544fd11f593d4caa400b6a08940efb3101b49bc571d387b8243ba0c85ca3b950010437df4376"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sox \
python39-sox \
python3dist-sox"

RDEPENDS:${PN} += "python-abi \
sox"

inherit rpm
