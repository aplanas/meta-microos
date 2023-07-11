SUMMARY = "Filesystem interface over GCS"
DESCRIPTION = "File-system interface for Google Cloud Storage."
LICENSE = "BSD-3-Clause"

PV = "2023.6.0"

RPM_NAME = "python310-gcsfs-2023.6.0-1.1.noarch.rpm"
RPM_HASH = "e4e045dde6242edbc3547c6cac702512ffd110d0e20f7e9777473bfa80f91a38390db2d4d85fad1baf6eda2a6188aa55d28517f8a4e767dea2ca942032ab130c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-gcsfs \
python310-gcsfs \
python3dist-gcsfs"

RDEPENDS:${PN} += "python-abi \
python310-aiohttp \
python310-decorator \
python310-fsspec \
python310-google-auth \
python310-google-auth-oauthlib \
python310-google-cloud-storage \
python310-requests"

inherit rpm
