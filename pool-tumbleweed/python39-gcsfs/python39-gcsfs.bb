SUMMARY = "Filesystem interface over GCS"
DESCRIPTION = "File-system interface for Google Cloud Storage."
LICENSE = "BSD-3-Clause"

PV = "2023.3.0"

RPM_NAME = "python39-gcsfs-2023.3.0-1.2.noarch.rpm"
RPM_HASH = "d0734c61e53fbf733b35ad509eeedf161353fb77f83b38c2ab7bea552a8798907cce8886b9ce936b7411fe5f85de8faba1e283c3d3a4857d0426411c32f40810"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(gcsfs) \
python39-gcsfs \
python3dist(gcsfs)"
RDEPENDS:${PN} += "python(abi) \
python39-aiohttp \
python39-decorator \
python39-fsspec \
python39-google-auth \
python39-google-auth-oauthlib \
python39-google-cloud-storage \
python39-requests"

inherit rpm
