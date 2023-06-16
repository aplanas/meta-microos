SUMMARY = "Module to diff JSON and JSON-like structures in Python"
DESCRIPTION = "Package to show differences between JSON and JSON-like structures in Python"
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-jsondiff-2.0.0-1.6.noarch.rpm"
RPM_HASH = "1df1cc47581ebc258b61c927de953b590cde4195759d132d39b5581ec6f379e7270c0d13fbf729227b034adf22da03d807a17061b779057903bdca78dfcb4fa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsondiff \
python3.10dist-jsondiff \
python310-jsondiff \
python3dist-jsondiff"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
