SUMMARY = "Client library for interacting with Gerrit code review"
DESCRIPTION = "Client library for interacting with Gerrit code review rest api \
 \
Pygerrit2 provides a simple interface for clients to interact with \
Gerrit code review via its rest api. \
 \
See also: https://gerritcodereview.com/"
LICENSE = "MIT"

PV = "2.0.15"

RPM_NAME = "python310-pygerrit2-2.0.15-1.8.noarch.rpm"
RPM_HASH = "43723ae450c2dbcdbb3f2b05455491183711661bdc628caf9b16c888c959dbd46263eb6650cd16a677eacfca579b4bd2185d846e89d79bed9b9d2853d2617660"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pygerrit2 \
python310-pygerrit2 \
python3dist-pygerrit2"

RDEPENDS:${PN} += "python-abi \
python310-pbr \
python310-requests"

inherit rpm
