SUMMARY = "Minimal low-level Python HTTP client"
DESCRIPTION = "Python minimal low-level HTTP client."
LICENSE = "BSD-3-Clause"

PV = "0.17.0"

RPM_NAME = "python310-httpcore-0.17.0-1.1.noarch.rpm"
RPM_HASH = "c5dd7cc9335c757297a17f4aff97e75a96878912c2098f6ef85ccce264da3745eb8d53213e94c9a4f472a30787f76d2d51e0c033beae25da66d37fa1c20a9401"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-httpcore \
python3.10dist-httpcore \
python310-httpcore \
python3dist-httpcore"

RDEPENDS:${PN} += "-python310-anyio >= 3 with python310-anyio < 5 \
-python310-h11 >= 0.13.0 with python310-h11 < 0.15 \
-python310-sniffio >= 1.0 with python310-sniffio < 2 \
python-abi \
python310-certifi"

inherit rpm
