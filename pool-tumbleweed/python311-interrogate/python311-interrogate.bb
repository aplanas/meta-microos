SUMMARY = "Interrogate a codebase for docstring coverage"
DESCRIPTION = "Interrogate a codebase for docstring coverage."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python311-interrogate-1.5.0-1.6.noarch.rpm"
RPM_HASH = "1d1a1a0be99ae433def7e816d74e56642eff4cdc5b05eb50cbf5c0babb72fca25795ca38ab48ca2339b1b9194d327e92f633dc7cd12b2c91337add2fa43b7f06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-interrogate \
python3.11dist-interrogate \
python311-interrogate \
python3dist-interrogate"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-attrs \
python311-click \
python311-colorama \
python311-py \
python311-tabulate \
python311-toml \
update-alternatives"

inherit rpm
