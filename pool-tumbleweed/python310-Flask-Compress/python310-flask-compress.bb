SUMMARY = "Compress responses in Flask apps with gzip"
DESCRIPTION = "Flask-Compress allows compressing a Flask application's \
responses with gzip. \
 \
The preferred solution is to have a server (like Nginx) automatically \
compress the static files. If that option is not available, \
Flask-Compress can solve the problem."
LICENSE = "MIT"

PV = "1.13"

RPM_NAME = "python310-Flask-Compress-1.13-1.5.noarch.rpm"
RPM_HASH = "c87d0430cf37f745059845a6cb6df7a95a9eeec92979ca77e3bab96ef72fc4406f7092b3723def3fdc9143cd9a87f5029dc53406e2e3e87aa5101101e2511baa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flask-compress \
python310-Flask-Compress \
python3dist-flask-compress"

RDEPENDS:${PN} += "python-abi \
python310-Brotli \
python310-Flask"

inherit rpm
