SUMMARY = "Minimal low-level Python HTTP client"
DESCRIPTION = "Python minimal low-level HTTP client."
LICENSE = "BSD-3-Clause"

PV = "0.17.0"

RPM_NAME = "python310-httpcore-0.17.0-1.3.noarch.rpm"
RPM_HASH = "63bcdcc921d51cdba4ca6e3dff0e4e21d72fee97866658cb24c5b32953083bd2453816d4d556f2cf785d6aee75b59edc5583fb7a3c2290ba293be5f2682b3bd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-httpcore \
python310-httpcore \
python3dist-httpcore"

RDEPENDS:${PN} += "-python310-anyio >= 3 with python310-anyio < 5 \
-python310-h11 >= 0.13.0 with python310-h11 < 0.15 \
-python310-sniffio >= 1.0 with python310-sniffio < 2 \
python-abi \
python310-certifi"

inherit rpm
