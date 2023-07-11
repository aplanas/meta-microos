SUMMARY = "Flask minifier for HTML responses"
DESCRIPTION = "Flask-HTMLmin minimizes HTML rendered by Flask."
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "python310-Flask-HTMLmin-2.2.0-1.5.noarch.rpm"
RPM_HASH = "cf3f38e030bf2a32ce1f022bc31d9fc71e1b2cd1363847a37f5c54c08aeca18604140edb2153f6672cad4a79423733ca9262025dba767449a4c792ea8cbbb16f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flask-htmlmin \
python310-Flask-HTMLmin \
python3dist-flask-htmlmin"

RDEPENDS:${PN} += "python-abi \
python310-Flask \
python310-cssmin \
python310-htmlmin"

inherit rpm
