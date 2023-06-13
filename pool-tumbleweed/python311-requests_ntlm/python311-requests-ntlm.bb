SUMMARY = "NTLM authentication for the python-requests library"
DESCRIPTION = "This package allows for HTTP NTLM authentication using \
python-requests. HttpNtlmAuth extends requests' AuthBase, so it can \
be dropped directly in place, or used in conjunction with a Session \
to make use of connection pooling."
LICENSE = "ISC"

PV = "1.2.0"

RPM_NAME = "python311-requests_ntlm-1.2.0-2.1.noarch.rpm"
RPM_HASH = "c3b4a256ed286ebcfc12eb1d44233450edbac3feca7f5df19dedd55df554359b811be2069dca1dc95b14a015ba0598ad0d3614ba4864bcf8c23a63488653c2c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(requests-ntlm) \
python311-requests_ntlm \
python3dist(requests-ntlm)"

RDEPENDS:${PN} += "python(abi) \
python311-cryptography \
python311-pyspnego \
python311-requests"

inherit rpm
