SUMMARY = "The python pandas[clipboard] extra"
DESCRIPTION = "This package provides the [clipboard] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python39-pandas-clipboard-2.0.3-1.3.noarch.rpm"
RPM_HASH = "5757455c62c403ff308e16898c97dc3e22fd849a0011e5726a18610729a2db8be6f6f9eb210e6f7d53702cfff487abdc23cbde44477fb7e48b05fa5731e47109"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-clipboard"

RDEPENDS:${PN} += "python39-PyQt5 \
python39-QtPy \
python39-pandas"

inherit rpm
