SUMMARY = "GeoJSON <-> WKT/WKB conversion utilities"
DESCRIPTION = "GeoJSON <-> WKT/WKB conversion utilities"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python310-geomet-1.0.0-1.1.noarch.rpm"
RPM_HASH = "99e21102c34e4c8679072be9460ec70a4d9d0a50003fd5f6c180d7ea5c469a7e4c8d93eb7b548bb413bd6dbb9efa101cfd70eecbfdfd086bd74d908c6722d617"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-geomet \
python3.10dist(geomet) \
python310-geomet \
python3dist(geomet)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-click \
update-alternatives"

inherit rpm
