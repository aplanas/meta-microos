SUMMARY = "Identity management for flask"
DESCRIPTION = "Flask-Principal provides a very loose framework to tie in providers of \
two types of services, often located in different parts of a web application: \
Authentication providers and User information providers."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python311-Flask-Principal-0.4.0-3.10.noarch.rpm"
RPM_HASH = "09853e8299d086043dec64a04e3f2404975b53dd29efd648eb3d3e8534149f6d3927e50610b3da6b534aa82be83d9a7eff6d9269b395f45b99a8fe445cd83a1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Principal \
python3.11dist-flask-principal \
python311-Flask-Principal \
python3dist-flask-principal"

RDEPENDS:${PN} += "python-abi \
python311-Flask \
python311-blinker"

inherit rpm
