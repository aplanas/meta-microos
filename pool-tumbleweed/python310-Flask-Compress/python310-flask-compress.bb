SUMMARY = "Compress responses in Flask apps with gzip"
DESCRIPTION = "Flask-Compress allows compressing a Flask application's \
responses with gzip. \
 \
The preferred solution is to have a server (like Nginx) automatically \
compress the static files. If that option is not available, \
Flask-Compress can solve the problem."
LICENSE = "MIT"

PV = "1.13"

RPM_NAME = "python310-Flask-Compress-1.13-1.3.noarch.rpm"
RPM_HASH = "99b0aaab33eecb0065f37cda17de64cdfd5fe6acda69d6a3cbe72086878e728a332c5a720d3334ef2928bef590a5b938439032f8e4a73ae08cb76b748b54b31c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Compress \
python3.10dist-flask-compress \
python310-Flask-Compress \
python3dist-flask-compress"

RDEPENDS:${PN} += "python-abi \
python310-Brotli \
python310-Flask"

inherit rpm
