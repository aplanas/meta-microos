SUMMARY = "The python pandas[clipboard] extra"
DESCRIPTION = "This package provides the [clipboard] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python311-pandas-clipboard-2.0.3-1.2.noarch.rpm"
RPM_HASH = "02518a738f1e373d15a79ce8330d1e0f9c276ba45e8ecefbc2b426ffcf66162f4562bc73032d896bfaa09d56b25c626d566ecd7fc99ba107e34f1f3d0cee7162"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-clipboard \
python311-pandas-clipboard"

RDEPENDS:${PN} += "python311-PyQt5 \
python311-QtPy \
python311-pandas"

inherit rpm
