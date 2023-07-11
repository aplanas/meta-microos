SUMMARY = "A python svg graph plotting library"
DESCRIPTION = "Pygal is a dynamic SVG charting library written in python. \
It supports various chart types and CSS styling."
LICENSE = "LGPL-3.0-or-later"

PV = "3.0.0"

RPM_NAME = "python39-pygal-3.0.0-3.3.noarch.rpm"
RPM_HASH = "ca84bfd0824b69406129cd071edcacd56445d019515c9b772b1be281c7e0d3d19cb7195e54b75c2e621f712b2285eea03dcf08f815c0fc9011482dd6bc8c509f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pygal \
python39-pygal \
python3dist-pygal"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-lxml \
update-alternatives"

inherit rpm
