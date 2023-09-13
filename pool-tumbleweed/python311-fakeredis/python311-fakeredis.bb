SUMMARY = "Fake implementation of redis API for testing purposes"
DESCRIPTION = "Fake implementation of redis API for testing purposes."
LICENSE = "BSD-3-Clause & MIT"

PV = "2.18.0"

RPM_NAME = "python311-fakeredis-2.18.0-1.1.noarch.rpm"
RPM_HASH = "ddc802bc0464a81111864d7fab06e3d6580643cf6ee3905442d8148a3f9382aafc7a92557dc6ed57854e10f6250ea8054e75752af7a6b3b1d79808195999afbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fakeredis \
python3.11dist-fakeredis \
python311-fakeredis \
python3dist-fakeredis"

RDEPENDS:${PN} += "python-abi \
python311-packaging \
python311-redis \
python311-sortedcontainers"

inherit rpm
