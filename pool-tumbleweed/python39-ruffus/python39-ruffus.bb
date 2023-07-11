SUMMARY = "Python computational pipeline management package"
DESCRIPTION = "The Ruffus module is a way to add support for running computational pipelines."
LICENSE = "MIT"

PV = "2.8.4"

RPM_NAME = "python39-ruffus-2.8.4-2.7.noarch.rpm"
RPM_HASH = "6d1a105397f726bcec01dc3d536f45c1df9142f08ac2b6c09802cc110d7710ceff4d2cff93c109e1310a5aaa8b54d0ec7a0202af096b2aded05473472c6a7ea6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ruffus \
python39-ruffus \
python3dist-ruffus"

RDEPENDS:${PN} += "python-abi"

inherit rpm
