SUMMARY = "Command-line tool to manage CPython Misc/NEWS.d entries"
DESCRIPTION = "Command-line tool to manage CPython Misc/NEWS.d entries."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python311-blurb-1.1.0-2.3.noarch.rpm"
RPM_HASH = "1e99305606466c9c4c7f1bf4623e2a929b40e68c63d7f39e4bd76c2d9447bb2c405fd6a0484adcabb01d5c6fe93255c68dae4c1f1b877a93a4a8ec7d4a101eff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-blurb \
python3.11dist-blurb \
python311-blurb \
python3dist-blurb"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
