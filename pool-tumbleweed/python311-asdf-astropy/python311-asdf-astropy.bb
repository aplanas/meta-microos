SUMMARY = "ASDF serialization support for astropy"
DESCRIPTION = "ASDF serialization support for astropy"
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "python311-asdf-astropy-0.4.0-1.4.noarch.rpm"
RPM_HASH = "e7b413939070c8861eb9d788f98e5378a3648d2e07b68b8b909f080c34466d141eaec1ec7f787474d69236dce705da601674bef825e662a10339b374a7d1cf1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asdf-astropy \
python3.11dist-asdf-astropy \
python311-asdf-astropy \
python3dist-asdf-astropy"

RDEPENDS:${PN} += "python-abi \
python311-asdf \
python311-asdf-coordinates-schemas \
python311-asdf-transform-schemas \
python311-astropy \
python311-numpy \
python311-packaging"

inherit rpm
