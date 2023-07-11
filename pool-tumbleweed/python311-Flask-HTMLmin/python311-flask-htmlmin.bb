SUMMARY = "Flask minifier for HTML responses"
DESCRIPTION = "Flask-HTMLmin minimizes HTML rendered by Flask."
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "python311-Flask-HTMLmin-2.2.0-1.5.noarch.rpm"
RPM_HASH = "2d12abd78c78bc0520f79527e6cb1e5620b4552ee29218219445f8e65c39b041ad5350a93b83b3d46cee4821de65b063c74317db769485365e87d489665aa704"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-HTMLmin \
python3.11dist-flask-htmlmin \
python311-Flask-HTMLmin \
python3dist-flask-htmlmin"

RDEPENDS:${PN} += "python-abi \
python311-Flask \
python311-cssmin \
python311-htmlmin"

inherit rpm
