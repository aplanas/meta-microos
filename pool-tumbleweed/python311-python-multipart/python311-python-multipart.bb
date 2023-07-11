SUMMARY = "Python streaming multipart parser"
DESCRIPTION = "A streaming multipart parser for Python."
LICENSE = "Apache-2.0"

PV = "0.0.5"

RPM_NAME = "python311-python-multipart-0.0.5-6.1.noarch.rpm"
RPM_HASH = "ebef828b3d0b99fa0b1181946e873f3097e0ddc3d718218a71625d44304b8aa00d043650159a3ef3936f01f200847af5b526485a3a030a50cfb86426e1193432"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-multipart \
python3.11dist-python-multipart \
python311-python-multipart \
python3dist-python-multipart"

RDEPENDS:${PN} += "python-abi"

inherit rpm
