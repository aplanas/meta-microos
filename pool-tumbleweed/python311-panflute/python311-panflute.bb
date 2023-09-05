SUMMARY = "Pandoc filters package for Python"
DESCRIPTION = "Panflute is a Python package for writing Pandoc filters."
LICENSE = "BSD-3-Clause"

PV = "2.3.0"

RPM_NAME = "python311-panflute-2.3.0-2.1.noarch.rpm"
RPM_HASH = "bced439bc2fcfc8d7add781b224641cf7019e6b4ee0f4ba8c95286fe035b149feeab5d07ff5a0419cf2a9d2215905b3960630d8f934cb4327b691647194da7af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-panflute \
python3.11dist-panflute \
python311-panflute \
python3dist-panflute"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-PyYAML \
python311-click \
update-alternatives"

inherit rpm
