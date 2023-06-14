SUMMARY = "Pandoc filters package for Python"
DESCRIPTION = "Panflute is a Python package for writing Pandoc filters."
LICENSE = "BSD-3-Clause"

PV = "2.3.0"

RPM_NAME = "python39-panflute-2.3.0-1.1.noarch.rpm"
RPM_HASH = "44030d600c150c74f308bc42d4a960736c3d60481416ade3a045d36d5a98ecf606a7703ec9055d577be7be4351716651fb96a8e11c8c7a354d232b82deec6b7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-panflute \
python39-panflute \
python3dist-panflute"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-PyYAML \
python39-click \
python39-future \
update-alternatives"

inherit rpm
