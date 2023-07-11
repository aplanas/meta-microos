SUMMARY = "Command-line tool to manage CPython Misc/NEWS.d entries"
DESCRIPTION = "Command-line tool to manage CPython Misc/NEWS.d entries."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python310-blurb-1.1.0-2.3.noarch.rpm"
RPM_HASH = "24c1754599032d5f9888f06d8cdec4ca4fdfc731fde048bb2d69e35aa108e68c5030c25504c48beaac0f6a989cf683aca780fcf4fd52e8896a9f3a1ef8a5ee69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-blurb \
python310-blurb \
python3dist-blurb"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
