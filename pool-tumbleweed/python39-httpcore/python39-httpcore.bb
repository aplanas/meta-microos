SUMMARY = "Minimal low-level Python HTTP client"
DESCRIPTION = "Python minimal low-level HTTP client."
LICENSE = "BSD-3-Clause"

PV = "0.17.0"

RPM_NAME = "python39-httpcore-0.17.0-1.1.noarch.rpm"
RPM_HASH = "f6a756552dbcb19e7c2f2c671cd21b85de34415cc34fe5d90bc2312fcecebc24d410f78b7280855d3dfc793f88382ece9dfc0b3f6307659ab88c40f1aa3300c2"
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
