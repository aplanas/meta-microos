SUMMARY = "Python module to run and analyze benchmarks"
DESCRIPTION = "Python module to run and analyze benchmarks."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "python39-pyperf-2.5.0-1.6.noarch.rpm"
RPM_HASH = "710b128dd3f82465107215be65c709517305b96ffdf5a4d60e206b4501bab58bc1bf4f5db733c96c1477c1b516fe843dea5d59c0f5f11c21d6bf1e3a897ee772"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyperf \
python39-pyperf \
python3dist-pyperf"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
