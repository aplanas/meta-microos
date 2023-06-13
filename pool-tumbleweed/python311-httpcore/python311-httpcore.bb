SUMMARY = "Minimal low-level Python HTTP client"
DESCRIPTION = "Python minimal low-level HTTP client."
LICENSE = "BSD-3-Clause"

PV = "0.17.0"

RPM_NAME = "python311-httpcore-0.17.0-1.1.noarch.rpm"
RPM_HASH = "aca9c18160a4ea22e96b90bed13016d90acbf19ca755595f5cb96e073afe2cb617b52c0138755418f4c6eb60edd17359db45016f9fd9b61369fc681e85f5633e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(httpcore) \
python311-httpcore \
python3dist(httpcore)"

RDEPENDS:${PN} += "(python311-anyio >= 3 with python311-anyio < 5) \
(python311-h11 >= 0.13.0 with python311-h11 < 0.15) \
(python311-sniffio >= 1.0 with python311-sniffio < 2) \
python(abi) \
python311-certifi"

inherit rpm
