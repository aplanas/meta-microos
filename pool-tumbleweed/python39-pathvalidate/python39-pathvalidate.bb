SUMMARY = "Python library to sanitize/validate a string such as filenames"
DESCRIPTION = "pathvalidate is a Python library to sanitize/validate a string such as \
filenames/file-paths/etc."
LICENSE = "MIT"

PV = "2.5.2"

RPM_NAME = "python39-pathvalidate-2.5.2-1.4.noarch.rpm"
RPM_HASH = "cbe02335e436b8b9939da9fdba799794e2af5d491fac128296a0feb53043e5aaeabc7d0ef3c3de37e60273ae43ccc7a42d1bfc765b07d8019089be39ba3013c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pathvalidate \
python39-pathvalidate \
python3dist-pathvalidate"

RDEPENDS:${PN} += "python-abi \
python39-setuptools"

inherit rpm
