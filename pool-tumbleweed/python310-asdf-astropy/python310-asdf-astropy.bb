SUMMARY = "ASDF serialization support for astropy"
DESCRIPTION = "ASDF serialization support for astropy"
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "python310-asdf-astropy-0.4.0-1.3.noarch.rpm"
RPM_HASH = "a9ada1852c47a75968d13cb0c4d77df7a26ed972967caef1579461b8a218104100955c7606f36f145757f573bc4d5d46dce24f31a9b5b91871e08d9fd64d6204"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-asdf-astropy \
python310-asdf-astropy \
python3dist-asdf-astropy"

RDEPENDS:${PN} += "python-abi \
python310-asdf \
python310-asdf-coordinates-schemas \
python310-asdf-transform-schemas \
python310-astropy \
python310-numpy \
python310-packaging"

inherit rpm
