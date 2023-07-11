SUMMARY = "Python module to convert text with ANSI color codes to HTML or LaTeX"
DESCRIPTION = "A module to convert text with ANSI color codes to HTML or to LaTeX."
LICENSE = "LGPL-3.0-or-later"

PV = "1.8.0"

RPM_NAME = "python310-ansi2html-1.8.0-2.3.noarch.rpm"
RPM_HASH = "bf59568cf10784eafe4e9f1a179724c3d5ad21ef1dae9270fddc7c2ef9ae03e2a5f3048ee4e22941649212f3121e3db5ff6a58bd89d7fb4398bd39f2fee46289"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ansi2html \
python310-ansi2html \
python3dist-ansi2html"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-six \
update-alternatives"

inherit rpm
