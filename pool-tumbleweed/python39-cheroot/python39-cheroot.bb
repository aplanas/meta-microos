SUMMARY = "Pure-python HTTP server"
DESCRIPTION = "Cheroot is the pure-Python HTTP server used by CherryPy."
LICENSE = "BSD-3-Clause"

PV = "9.0.0"

RPM_NAME = "python39-cheroot-9.0.0-3.1.noarch.rpm"
RPM_HASH = "f0182348f9baae79bd666bad2a21c622b190ae06d24acbac9bdc33b0cc8ec86ca641f3eb7c562bd80b9957b1d1573f93327dbcaf97c98cb14b2f51b8fedcf985"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cheroot \
python39-Cheroot \
python39-cheroot \
python3dist-cheroot"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
alts \
python-abi \
python39-jaraco.functools \
python39-more-itertools"

inherit rpm
