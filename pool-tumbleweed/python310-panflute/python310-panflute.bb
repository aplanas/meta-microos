SUMMARY = "Pandoc filters package for Python"
DESCRIPTION = "Panflute is a Python package for writing Pandoc filters."
LICENSE = "BSD-3-Clause"

PV = "2.3.0"

RPM_NAME = "python310-panflute-2.3.0-2.1.noarch.rpm"
RPM_HASH = "7f86bc61cdbfbd38e849f7670f133d05d3156e6cd0f9d16f9dddceb45e4562914ea7d444725b8ea070efc1e28b1e51b3aab1f0ba6e9e5613c58d9db898f45e7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-panflute \
python310-panflute \
python3dist-panflute"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-PyYAML \
python310-click \
update-alternatives"

inherit rpm
