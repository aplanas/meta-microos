SUMMARY = "Send responses to httpx"
DESCRIPTION = "Send responses to httpx."
LICENSE = "MIT"

PV = "0.22.0"

RPM_NAME = "python311-pytest-httpx-0.22.0-1.1.noarch.rpm"
RPM_HASH = "d6b78453c25a700216cf4c3172f7f874af6ba7e23bee486c9becf8d3709b73ad8acee2ed144534b636b0649128ab5cb324161dfaaea446e1de413751d9d9da1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pytest-httpx \
python311-pytest-httpx \
python3dist-pytest-httpx"

RDEPENDS:${PN} += "python-abi \
python311-httpx \
python311-pytest"

inherit rpm
