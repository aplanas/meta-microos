SUMMARY = "Compress responses in Flask apps with gzip"
DESCRIPTION = "Flask-Compress allows compressing a Flask application's \
responses with gzip. \
 \
The preferred solution is to have a server (like Nginx) automatically \
compress the static files. If that option is not available, \
Flask-Compress can solve the problem."
LICENSE = "MIT"

PV = "1.13"

RPM_NAME = "python311-Flask-Compress-1.13-1.5.noarch.rpm"
RPM_HASH = "fa7e07946662b0e85c02b6a040fafb2deda864dc196f447627ea178695f2c350948a54d7575000122f9e711349ee1ba4e74d032004865caa0478d239b26ac68e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Compress \
python3.11dist-flask-compress \
python311-Flask-Compress \
python3dist-flask-compress"

RDEPENDS:${PN} += "python-abi \
python311-Brotli \
python311-Flask"

inherit rpm
