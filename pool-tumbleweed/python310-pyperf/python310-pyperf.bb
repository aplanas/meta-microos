SUMMARY = "Python module to run and analyze benchmarks"
DESCRIPTION = "Python module to run and analyze benchmarks."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "python310-pyperf-2.5.0-1.6.noarch.rpm"
RPM_HASH = "45c96ca6d6feb1083aaf820b75ae3e8c41a48d59fe4d4b55f7f06e2ccdcd34279345ae7d752a658e4314c67b7e1ee7a2a00e0b1fb255f49a3631e17ecd1c6637"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyperf \
python310-pyperf \
python3dist-pyperf"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
