SUMMARY = "The python pandas[clipboard] extra"
DESCRIPTION = "This package provides the [clipboard] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python311-pandas-clipboard-2.0.2-4.1.noarch.rpm"
RPM_HASH = "bd82a92988bf0aba4cb33b18b5a1a014871142e5f63816d679283f9eda8d419c21c97d71413e53ed44021c25acfddf8b733d3bdfdf443e210fa9ab65c98b7a93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-clipboard \
python311-pandas-clipboard"

RDEPENDS:${PN} += "python311-PyQt5 \
python311-QtPy \
python311-pandas"

inherit rpm
