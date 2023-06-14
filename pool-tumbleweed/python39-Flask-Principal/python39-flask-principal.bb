SUMMARY = "Identity management for flask"
DESCRIPTION = "Flask-Principal provides a very loose framework to tie in providers of \
two types of services, often located in different parts of a web application: \
Authentication providers and User information providers."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python39-Flask-Principal-0.4.0-3.8.noarch.rpm"
RPM_HASH = "a29938903a76d364995fb671868a81a71e6d72a6daca3be64f02e32bbfa7a34094ca0ad0593efdf6b16c5980ba0e8f3cae547cdf5c8b976e688b331698e0d9c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flask-principal \
python39-Flask-Principal \
python3dist-flask-principal"

RDEPENDS:${PN} += "python-abi \
python39-Flask \
python39-blinker"

inherit rpm
