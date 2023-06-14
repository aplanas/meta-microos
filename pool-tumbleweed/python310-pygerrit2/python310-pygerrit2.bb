SUMMARY = "Client library for interacting with Gerrit code review"
DESCRIPTION = "Client library for interacting with Gerrit code review rest api \
 \
Pygerrit2 provides a simple interface for clients to interact with \
Gerrit code review via its rest api. \
 \
See also: https://gerritcodereview.com/"
LICENSE = "MIT"

PV = "2.0.15"

RPM_NAME = "python310-pygerrit2-2.0.15-1.6.noarch.rpm"
RPM_HASH = "d321ef372b8e1a2caea761c529e164e75dda13c9f23f10cbd3e632cb81cfc1d64b4b3fedfac31e5b244738445fe81c896aef5015a8396c0b822640c24d5dd66c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pygerrit2 \
python3.10dist-pygerrit2 \
python310-pygerrit2 \
python3dist-pygerrit2"

RDEPENDS:${PN} += "python-abi \
python310-pbr \
python310-requests"

inherit rpm
