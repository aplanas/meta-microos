SUMMARY = "Python module for repairing mis-decoded Unicode text"
DESCRIPTION = "Ftfy attempts to repair Unicode text that has been erroneously \
put through an encode/decode cycle with different encodings."
LICENSE = "MIT"

PV = "6.0.3"

RPM_NAME = "python39-ftfy-6.0.3-1.7.noarch.rpm"
RPM_HASH = "06dd136a8cd224a00ae4a16930e351fdae2869d142980b7aee3fca82253ff88f465c76d6067fbff83f5f89a02a34406c0fa66474ec2b36fb9154221414e1b355"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ftfy \
python39-ftfy \
python3dist-ftfy"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-wcwidth \
update-alternatives"

inherit rpm
