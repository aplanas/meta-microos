SUMMARY = "The python pandas[compression] extra"
DESCRIPTION = "This package provides the [compression] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python39-pandas-compression-2.1.0-1.2.noarch.rpm"
RPM_HASH = "e794a4c969f41ae932bae67406ed550ca2762460d6803d0d07680bef8614f38a325bc8cf663ece8cf7c84348ded2a3ba587092e7ce757ac1222040d25dc0efb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-compression"

RDEPENDS:${PN} += "python39-pandas \
python39-zstandard"

inherit rpm
