SUMMARY = "A library wrapping email authentication header verification and generation"
DESCRIPTION = "A library wrapping email authentication header verification and generation."
LICENSE = "MIT"

PV = "0.14.1"

RPM_NAME = "python311-authheaders-0.14.1-2.3.noarch.rpm"
RPM_HASH = "378d3ddd3b6c3f9fc2197ed04a9d2fdd2b233e7d62ab51e93d220e2aa7ab4465232ba120b002abafd9063f2bc840efe8c3c770176505ecab956983078317064f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-authheaders \
python3.11dist-authheaders \
python311-authheaders \
python3dist-authheaders"

RDEPENDS:${PN} += "python-abi \
python311-authres \
python311-dkimpy \
python311-dnspython \
python311-publicsuffix2"

inherit rpm
