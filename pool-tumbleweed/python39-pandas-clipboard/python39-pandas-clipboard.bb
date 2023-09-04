SUMMARY = "The python pandas[clipboard] extra"
DESCRIPTION = "This package provides the [clipboard] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python39-pandas-clipboard-2.0.3-1.2.noarch.rpm"
RPM_HASH = "0681cea4b3b96503f78815cf2bf3b31ba92115801c0b5d455468a443068a3c801489f732d9177194cf67fb67ef211be37110ff82bb70ebf48c74d0a1377e98da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-clipboard"

RDEPENDS:${PN} += "python39-PyQt5 \
python39-QtPy \
python39-pandas"

inherit rpm
