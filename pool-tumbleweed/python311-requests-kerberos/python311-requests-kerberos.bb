SUMMARY = "A Kerberos authentication handler for python-requests"
DESCRIPTION = "Requests is an HTTP library, written in Python, for human beings. This library \
adds optional Kerberos/GSSAPI authentication support and supports mutual \
authentication. Basic GET usage:"
LICENSE = "ISC"

PV = "0.14.0"

RPM_NAME = "python311-requests-kerberos-0.14.0-2.1.noarch.rpm"
RPM_HASH = "92c0f7cbb417d6e8d611498e617cf5d7f2a24e6ce0da4155b1dfe276f6263f1662d53fc9099e0f090d8e78570e38d5d89bf81f83cb30b764b5bdcc0e128f4b6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-kerberos \
python3.11dist-requests-kerberos \
python311-requests-kerberos \
python3dist-requests-kerberos"

RDEPENDS:${PN} += "python-abi \
python311-pyspnego \
python311-requests"

inherit rpm
