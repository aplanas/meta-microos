SUMMARY = "Read and write image files in the Netpbm format"
DESCRIPTION = "Netpbmfile is a Python library to read and write image files in the Netpbm \
format."
LICENSE = "BSD-3-Clause"

PV = "2020.10.18"

RPM_NAME = "python310-netpbmfile-2020.10.18-2.10.noarch.rpm"
RPM_HASH = "ee59c3689100be19f804f153073f0a0a1736d7fe52629c65ec16fc53fc52b57b51dbc2d63a1c1d6e81a58496172020a222b904644eb5c0b627eddf24753229ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-netpbmfile \
python3.10dist-netpbmfile \
python310-netpbmfile \
python3dist-netpbmfile"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-matplotlib \
python310-numpy \
update-alternatives"

inherit rpm
