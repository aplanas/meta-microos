SUMMARY = "Python module to run and analyze benchmarks"
DESCRIPTION = "Python module to run and analyze benchmarks."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "python311-pyperf-2.5.0-1.6.noarch.rpm"
RPM_HASH = "e3d218eeb4c454746432be8c049b3fbea6b10dd24c3940ecd04e90f7123fa09e5f360bdb8364dd7f821bdb9da0fc53a807e3b895fc5f5e0e1f051c41aac826a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyperf \
python3.11dist-pyperf \
python311-pyperf \
python3dist-pyperf"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
