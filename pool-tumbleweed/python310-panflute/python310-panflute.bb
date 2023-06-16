SUMMARY = "Pandoc filters package for Python"
DESCRIPTION = "Panflute is a Python package for writing Pandoc filters."
LICENSE = "BSD-3-Clause"

PV = "2.3.0"

RPM_NAME = "python310-panflute-2.3.0-1.1.noarch.rpm"
RPM_HASH = "8468179e45f9c3ad205b1ff256b1e2eff85af008fb7eca1c2de322a934eb466a3de6c8f57ca9cbe80c2a7c80a35ad73ed473c69ff8c4ad9806c556f5d61cb0e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-panflute \
python3.10dist-panflute \
python310-panflute \
python3dist-panflute"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-PyYAML \
python310-click \
python310-future \
update-alternatives"

inherit rpm
