SUMMARY = "A pyunit extension to output JUnit compatible XML"
DESCRIPTION = "A Python unittest TestResult that outputs JUnit compatible XML."
LICENSE = "LGPL-3.0-or-later"

PV = "0.7"

RPM_NAME = "python39-junitxml-0.7-4.7.noarch.rpm"
RPM_HASH = "2bf67e6722dcf4a911e257d3a62460f1f687807b5e46bcef890f598bb87c19bdf54f7afab41bcabe37152cae317f293290c962948e49a6dfaf5cd356c594b4a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(junitxml) \
python39-junitxml \
python3dist(junitxml)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi)"

inherit rpm
