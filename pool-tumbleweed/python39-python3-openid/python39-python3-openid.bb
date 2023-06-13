SUMMARY = "OpenID support for Python"
DESCRIPTION = "This is a set of Python packages to support the use of \
the OpenID decentralized identity system in applications. \
Includes example code and support for a variety of storage back-ends."
LICENSE = "Apache-2.0"

PV = "3.2.0"

RPM_NAME = "python39-python3-openid-3.2.0-1.13.noarch.rpm"
RPM_HASH = "a636bca58d9eac017fabffb72d3aba45711d59dd1525edbfa25ed87c57f0c6fb870a81f791f0ad814f71746b80a0c10032ed53c33b1482b9acd566df53767817"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python3-openid) \
python39-python3-openid \
python3dist(python3-openid)"

RDEPENDS:${PN} += "python(abi) \
python39-defusedxml"

inherit rpm
