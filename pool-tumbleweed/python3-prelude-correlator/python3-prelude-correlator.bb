SUMMARY = "Prelude Correlator python3 files"
DESCRIPTION = "Python 3 files for Prelude Correlator."
LICENSE = "GPL-2.0-or-later"

PV = "5.2.0"

RPM_NAME = "python3-prelude-correlator-5.2.0-2.6.noarch.rpm"
RPM_HASH = "8452faa42e4055802ed4d4108b0800965150f9000b534c1bd5439c1d3284a1bb1940067fca90781ce20e8b2917dfcd8635b103e1638d4d58e5f852f666645b0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-prelude-correlator \
python3.11dist-prelude-correlator \
python3dist-prelude-correlator"

RDEPENDS:${PN} += "/usr/bin/python3 \
prelude-correlator \
python-abi \
python3-libprelude \
python3-netaddr"

inherit rpm
