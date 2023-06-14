SUMMARY = "Run commands and manipulate files locally or over SSH"
DESCRIPTION = "Run commands and manipulate files locally or over SSH using the same interface"
LICENSE = "BSD-2-Clause"

PV = "0.3.22"

RPM_NAME = "python39-spur-0.3.22-1.4.noarch.rpm"
RPM_HASH = "ed374eac1696424f3c37deea2adebda75ad0a581199665afebf166f4a9ee45ac5225b18f7f3f8215ddb15349ecb669e4bef77f7f73a36f0293cb3caf22c41fd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-spur \
python39-spur \
python3dist-spur"

RDEPENDS:${PN} += "python-abi \
python39-paramiko"

inherit rpm
