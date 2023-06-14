SUMMARY = "Python module to run and analyze benchmarks"
DESCRIPTION = "Python module to run and analyze benchmarks."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "python310-pyperf-2.5.0-1.4.noarch.rpm"
RPM_HASH = "cabe86846fecdee6ffcdd81d6c73b146e9cee1558e50e928cb3db352d1794a384cfec0a680b723dc4c0cfe1b8f8f0434f52a1b7fd74d71825f11a4aa36c83f15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyperf \
python3.10dist-pyperf \
python310-pyperf \
python3dist-pyperf"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
update-alternatives"

inherit rpm
