SUMMARY = "Filesystem interface over GCS"
DESCRIPTION = "File-system interface for Google Cloud Storage."
LICENSE = "BSD-3-Clause"

PV = "2023.3.0"

RPM_NAME = "python310-gcsfs-2023.3.0-1.2.noarch.rpm"
RPM_HASH = "1939151b702c4ecf332a1c3516982b0e50e4163d5cb4dcba8e5b27b58117a6909ca6edabd2ec9de714c5000c945868007bc22e44f543be11af579c58c020b87e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gcsfs \
python3.10dist(gcsfs) \
python310-gcsfs \
python3dist(gcsfs)"

RDEPENDS:${PN} += "python(abi) \
python310-aiohttp \
python310-decorator \
python310-fsspec \
python310-google-auth \
python310-google-auth-oauthlib \
python310-google-cloud-storage \
python310-requests"

inherit rpm
