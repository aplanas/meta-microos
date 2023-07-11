SUMMARY = "Minimal PyPI server for uploading & downloading packages with pip/easy_install"
DESCRIPTION = "Minimal PyPI server for uploading & downloading packagesj with pip/easy_install"
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python39-pypiserver-1.5.1-2.3.noarch.rpm"
RPM_HASH = "465be9435c03e559aee4cc833d11a81f7e2aa2038b3ea1864283de4652fd20440a1aff053014ad72e3790200746d05be57253bb242bd0157a89a87c3686cfce2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pypiserver \
python39-pypiserver \
python3dist-pypiserver"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-passlib \
python39-setuptools \
update-alternatives"

inherit rpm
