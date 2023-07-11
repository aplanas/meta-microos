SUMMARY = "Compress responses in Flask apps with gzip"
DESCRIPTION = "Flask-Compress allows compressing a Flask application's \
responses with gzip. \
 \
The preferred solution is to have a server (like Nginx) automatically \
compress the static files. If that option is not available, \
Flask-Compress can solve the problem."
LICENSE = "MIT"

PV = "1.13"

RPM_NAME = "python39-Flask-Compress-1.13-1.5.noarch.rpm"
RPM_HASH = "3bd8ac6c631abd3e794db3e426f6e17a4b8d5f504359f57cd75d48e67e892218504d839cf5d7a85489fce89e4b51b3c3ba49eaced92f080970f66387d3bc978e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flask-compress \
python39-Flask-Compress \
python3dist-flask-compress"

RDEPENDS:${PN} += "python-abi \
python39-Brotli \
python39-Flask"

inherit rpm
