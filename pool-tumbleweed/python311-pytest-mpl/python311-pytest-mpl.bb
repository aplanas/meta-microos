SUMMARY = "Pytest plugin for testing Matplotlib figures"
DESCRIPTION = "This is a pytest plugin to help with testing figures output from Matplotlib."
LICENSE = "BSD-2-Clause"

PV = "0.12.0"

RPM_NAME = "python311-pytest-mpl-0.12.0-1.11.noarch.rpm"
RPM_HASH = "cbab69791556419197db22823fd2865e4247b79f169c12091efc9df3b0a20c0f3582cf7dcffa6b56ad9074ce2418e2669c988e68d383837b928dbf4138e8e855"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-mpl \
python3.11dist-pytest-mpl \
python311-pytest-mpl \
python3dist-pytest-mpl"

RDEPENDS:${PN} += "python-abi \
python311-Pillow \
python311-matplotlib \
python311-pytest"

inherit rpm
