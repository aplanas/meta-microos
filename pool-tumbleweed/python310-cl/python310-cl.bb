SUMMARY = "Kombu actor framework"
DESCRIPTION = "Actor framework for Kombu"
LICENSE = "BSD-2-Clause"

PV = "0.0.3"

RPM_NAME = "python310-cl-0.0.3-16.4.noarch.rpm"
RPM_HASH = "18a9534c5bbeca0987e6daf9ca0f25fd187f8092af482a884f88794c6de19eb7e4e8f4d4f57b7c1de4d018b120fbf75a09f1ce41bae6064404cfeac323e9c5b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cl \
python3.10dist(cl) \
python310-cl \
python3dist(cl)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-kombu \
update-alternatives"

inherit rpm
