SUMMARY = "Minimal low-level Python HTTP client"
DESCRIPTION = "Python minimal low-level HTTP client."
LICENSE = "BSD-3-Clause"

PV = "0.17.0"

RPM_NAME = "python311-httpcore-0.17.0-1.3.noarch.rpm"
RPM_HASH = "0ff6d57f590550093934d571791a74ed12e02c09be199cf958da0b967b98a9542f396de89bcb5e5ef964381b4b1bea2ef57ac87727522ef6d68e24b63adeb02a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-httpcore \
python3.11dist-httpcore \
python311-httpcore \
python3dist-httpcore"

RDEPENDS:${PN} += "-python311-anyio >= 3 with python311-anyio < 5 \
-python311-h11 >= 0.13.0 with python311-h11 < 0.15 \
-python311-sniffio >= 1.0 with python311-sniffio < 2 \
python-abi \
python311-certifi"

inherit rpm
