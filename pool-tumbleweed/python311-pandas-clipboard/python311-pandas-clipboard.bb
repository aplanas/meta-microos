SUMMARY = "The python pandas[clipboard] extra"
DESCRIPTION = "This package provides the [clipboard] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python311-pandas-clipboard-2.0.3-1.3.noarch.rpm"
RPM_HASH = "35a27a839be3f4c28b6a60e1098b9725dcc5d73f26ade6667f1a951059981860fc7080b400ae9cccaaba4f22c409d53f945bfc1a77b1204d7d2febb79d8d7b71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-clipboard \
python311-pandas-clipboard"

RDEPENDS:${PN} += "python311-PyQt5 \
python311-QtPy \
python311-pandas"

inherit rpm
