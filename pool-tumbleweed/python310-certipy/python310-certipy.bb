SUMMARY = "Create and sign CAs and certificates"
DESCRIPTION = "Create and sign CAs and certificates."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "python310-certipy-0.1.3-2.11.noarch.rpm"
RPM_HASH = "f4634a36fbd77ebf78f769b53a9a481b653ee90614682eea1fe8d3d9326b073a96dafd17e4ae614c3908ac0e952c2cecaa4d65c30a97caa0e39aa1818793ee16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certipy \
python3.10dist(certipy) \
python310-certipy \
python3dist(certipy)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-pyOpenSSL \
update-alternatives"

inherit rpm
