SUMMARY = "WTForms support for Flask"
DESCRIPTION = "Adds WTForms support to your Flask application"
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "python39-Flask-WTF-1.0.1-1.6.noarch.rpm"
RPM_HASH = "95f2b56e09faa09e5c6871d0a63186ec3cd206140cfda53e1f01e2929d6257c644d913b7e8db827c1d026bbf08864fce59816bc4230184365646db48871e997a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flask-wtf \
python39-Flask-WTF \
python3dist-flask-wtf"

RDEPENDS:${PN} += "python-abi \
python39-Flask \
python39-WTForms \
python39-Werkzeug \
python39-itsdangerous"

inherit rpm
