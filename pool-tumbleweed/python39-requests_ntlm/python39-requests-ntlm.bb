SUMMARY = "NTLM authentication for the python-requests library"
DESCRIPTION = "This package allows for HTTP NTLM authentication using \
python-requests. HttpNtlmAuth extends requests' AuthBase, so it can \
be dropped directly in place, or used in conjunction with a Session \
to make use of connection pooling."
LICENSE = "ISC"

PV = "1.2.0"

RPM_NAME = "python39-requests_ntlm-1.2.0-2.3.noarch.rpm"
RPM_HASH = "bff067a72ee69d57695ccd91cff2ce4c805dc6af3d7e6f57644cd1363b4904a7b6f688ade4cb73173459ecc2fc6e56764ce65fda98b519d8675be0bb8d7afa9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-requests-ntlm \
python39-requests-ntlm \
python3dist-requests-ntlm"

RDEPENDS:${PN} += "python-abi \
python39-cryptography \
python39-pyspnego \
python39-requests"

inherit rpm
