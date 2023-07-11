SUMMARY = "Identity management for flask"
DESCRIPTION = "Flask-Principal provides a very loose framework to tie in providers of \
two types of services, often located in different parts of a web application: \
Authentication providers and User information providers."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python310-Flask-Principal-0.4.0-3.10.noarch.rpm"
RPM_HASH = "3fe2759fab24347e9ff2f654ee52566e825c993c0427b7248bde2237e32367fc0d49fef9c05b68dc767d1e6e3104189cdadc679e2402daab77206c79965e8aba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flask-principal \
python310-Flask-Principal \
python3dist-flask-principal"

RDEPENDS:${PN} += "python-abi \
python310-Flask \
python310-blinker"

inherit rpm
