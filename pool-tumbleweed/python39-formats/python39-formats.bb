SUMMARY = "Support multiple formats with ease"
DESCRIPTION = "Formats will provide you with a consistent API to parse and compose data."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python39-formats-0.1.1-1.15.noarch.rpm"
RPM_HASH = "697de98b02ec14833262cee582b844208975e9812136f11a837428c373be87e3ebda639c36e0e3141875f1ff963b64074c89379ae7d78b52629e809bf6ebe14e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-formats \
python39-formats \
python3dist-formats"

RDEPENDS:${PN} += "python-abi"

inherit rpm
