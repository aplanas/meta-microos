SUMMARY = "Minimal low-level Python HTTP client"
DESCRIPTION = "Python minimal low-level HTTP client."
LICENSE = "BSD-3-Clause"

PV = "0.17.0"

RPM_NAME = "python39-httpcore-0.17.0-1.3.noarch.rpm"
RPM_HASH = "e33e4a242760090c0ae1ac1abad67a798145b0a1579ec5ff224aee763dbd1cb0be44d9f18312c302e6c286e28ca2709ae6107ad93d1555e074ca5c54d0178372"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-httpcore \
python39-httpcore \
python3dist-httpcore"

RDEPENDS:${PN} += "-python39-anyio >= 3 with python39-anyio < 5 \
-python39-h11 >= 0.13.0 with python39-h11 < 0.15 \
-python39-sniffio >= 1.0 with python39-sniffio < 2 \
python-abi \
python39-certifi"

inherit rpm
