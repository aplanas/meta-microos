SUMMARY = "Filesystem interface over GCS"
DESCRIPTION = "File-system interface for Google Cloud Storage."
LICENSE = "BSD-3-Clause"

PV = "2023.6.0"

RPM_NAME = "python39-gcsfs-2023.6.0-1.1.noarch.rpm"
RPM_HASH = "c7334a75d54cc4423ae65ff4b8ebe60deee4ce6072aae7966e295687d3b6bd2a2db34d699ba7e4badecd09325737d2fc6cbfb7c9806ee56f553392c0f4467983"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-gcsfs \
python39-gcsfs \
python3dist-gcsfs"

RDEPENDS:${PN} += "python-abi \
python39-aiohttp \
python39-decorator \
python39-fsspec \
python39-google-auth \
python39-google-auth-oauthlib \
python39-google-cloud-storage \
python39-requests"

inherit rpm
