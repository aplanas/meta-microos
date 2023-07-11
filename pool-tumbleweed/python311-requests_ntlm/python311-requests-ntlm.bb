SUMMARY = "NTLM authentication for the python-requests library"
DESCRIPTION = "This package allows for HTTP NTLM authentication using \
python-requests. HttpNtlmAuth extends requests' AuthBase, so it can \
be dropped directly in place, or used in conjunction with a Session \
to make use of connection pooling."
LICENSE = "ISC"

PV = "1.2.0"

RPM_NAME = "python311-requests_ntlm-1.2.0-2.3.noarch.rpm"
RPM_HASH = "e6fef1c5d15dede0ccd2cc64b76eec9ae5934b6d60eb9bf6500f43ffe40ad2cd0f0d1b2bccb1ac618e6dbafb4b74772cde7efd894cbe8c061a6762504d74517d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-ntlm \
python3.11dist-requests-ntlm \
python311-requests-ntlm \
python3dist-requests-ntlm"

RDEPENDS:${PN} += "python-abi \
python311-cryptography \
python311-pyspnego \
python311-requests"

inherit rpm
