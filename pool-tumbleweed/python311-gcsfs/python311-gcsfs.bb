SUMMARY = "Filesystem interface over GCS"
DESCRIPTION = "File-system interface for Google Cloud Storage."
LICENSE = "BSD-3-Clause"

PV = "2023.6.0"

RPM_NAME = "python311-gcsfs-2023.6.0-1.1.noarch.rpm"
RPM_HASH = "086a50df729e6fec5a27c6f639795228a077fb22580e4cc6015c274480957f7c9cc5c5356ac8a7864d725f01a27e14da43496bb73118626a4f63d996d75dce6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gcsfs \
python3.11dist-gcsfs \
python311-gcsfs \
python3dist-gcsfs"

RDEPENDS:${PN} += "python-abi \
python311-aiohttp \
python311-decorator \
python311-fsspec \
python311-google-auth \
python311-google-auth-oauthlib \
python311-google-cloud-storage \
python311-requests"

inherit rpm
