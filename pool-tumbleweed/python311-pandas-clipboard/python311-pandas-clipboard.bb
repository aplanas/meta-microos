SUMMARY = "The python pandas[clipboard] extra"
DESCRIPTION = "This package provides the [clipboard] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python311-pandas-clipboard-2.1.0-1.2.noarch.rpm"
RPM_HASH = "8932581dc49b0fb6e762520719c2f1e37af09ef07622e7fb6e2f22a17d187833872ba8998c4ee014f865f81db3ff2f2f665f5d7c5beda032cdb515b7056eeb40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-clipboard \
python311-pandas-clipboard"

RDEPENDS:${PN} += "python311-PyQt5 \
python311-QtPy \
python311-pandas"

inherit rpm
