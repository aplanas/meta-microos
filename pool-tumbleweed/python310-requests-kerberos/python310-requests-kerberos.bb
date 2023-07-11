SUMMARY = "A Kerberos authentication handler for python-requests"
DESCRIPTION = "Requests is an HTTP library, written in Python, for human beings. This library \
adds optional Kerberos/GSSAPI authentication support and supports mutual \
authentication. Basic GET usage:"
LICENSE = "ISC"

PV = "0.14.0"

RPM_NAME = "python310-requests-kerberos-0.14.0-1.10.noarch.rpm"
RPM_HASH = "b26d2c3c4bbe93be18860b88d062ba0191f2ece5ebbc326d2f20b203384c320bf5d45880aabf4a47734cc4373b9130f1723f0e412630bcb5d25fd6a0fa20cfbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-requests-kerberos \
python310-requests-kerberos \
python3dist-requests-kerberos"

RDEPENDS:${PN} += "python-abi \
python310-pyspnego \
python310-requests"

inherit rpm
