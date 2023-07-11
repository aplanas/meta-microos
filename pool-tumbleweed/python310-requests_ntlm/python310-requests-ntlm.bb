SUMMARY = "NTLM authentication for the python-requests library"
DESCRIPTION = "This package allows for HTTP NTLM authentication using \
python-requests. HttpNtlmAuth extends requests' AuthBase, so it can \
be dropped directly in place, or used in conjunction with a Session \
to make use of connection pooling."
LICENSE = "ISC"

PV = "1.2.0"

RPM_NAME = "python310-requests_ntlm-1.2.0-2.3.noarch.rpm"
RPM_HASH = "9cbb1ea93cd65c73e068a08e5e48c32da348c4338e913353ce1ec51cfabe97241cb2e17d671d14f65664652536f63842bf2a997531ec0e8e6bbf9b590986ed31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-requests-ntlm \
python310-requests-ntlm \
python3dist-requests-ntlm"

RDEPENDS:${PN} += "python-abi \
python310-cryptography \
python310-pyspnego \
python310-requests"

inherit rpm
