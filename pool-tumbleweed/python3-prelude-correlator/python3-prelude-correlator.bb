SUMMARY = "Prelude Correlator python3 files"
DESCRIPTION = "Python 3 files for Prelude Correlator."
LICENSE = "GPL-2.0-or-later"

PV = "5.2.0"

RPM_NAME = "python3-prelude-correlator-5.2.0-2.5.noarch.rpm"
RPM_HASH = "ccfc43b9244affc5d52afca134a550dd63be727d5e94f609f310b88403df92e682e1cef86614ffefdab8f5159ce2548f8dcc0524d6a8029aae485a37cdae4500"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-prelude-correlator \
python3.10dist-prelude-correlator \
python3dist-prelude-correlator"

RDEPENDS:${PN} += "/usr/bin/python3 \
prelude-correlator \
python-abi \
python3-libprelude \
python3-netaddr"

inherit rpm
