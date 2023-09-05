SUMMARY = "Pandoc filters package for Python"
DESCRIPTION = "Panflute is a Python package for writing Pandoc filters."
LICENSE = "BSD-3-Clause"

PV = "2.3.0"

RPM_NAME = "python39-panflute-2.3.0-2.1.noarch.rpm"
RPM_HASH = "c74ff3a31c1a9054ec6c803904daed4eef3c27733dfd73d4d646dc6d3e5818de9dd787b5e84731e7151d53e217063674ab8ee421d344752f88be9f5d6f31a3e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-panflute \
python39-panflute \
python3dist-panflute"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-PyYAML \
python39-click \
update-alternatives"

inherit rpm
