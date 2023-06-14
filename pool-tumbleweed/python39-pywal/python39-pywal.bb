SUMMARY = "Generate and change color-schemes on the fly"
DESCRIPTION = "Generate and change color-schemes on the fly"
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "python39-pywal-3.3.0-1.13.noarch.rpm"
RPM_HASH = "8bf84b323f27e925ebaf22fa6488b56bc649334529a67dc632296636a941a47f7c2079c9f4e1a1dce18afdff22890ee557b64f04b13e020337af8e8185911ddd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pywal \
python39-pywal \
python3dist-pywal"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi"

inherit rpm
