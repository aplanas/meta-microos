SUMMARY = "Python library to sanitize/validate a string such as filenames"
DESCRIPTION = "pathvalidate is a Python library to sanitize/validate a string such as \
filenames/file-paths/etc."
LICENSE = "MIT"

PV = "2.5.2"

RPM_NAME = "python311-pathvalidate-2.5.2-1.4.noarch.rpm"
RPM_HASH = "915bdd54daa02bf5d5897d72823d485a26cd4fbf7ab567002d78afa3065cbed5d5e188a12264be7d63737353ea80fecdd37cbf5d43f7dda06663b4ee8a3d66cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pathvalidate \
python3.11dist-pathvalidate \
python311-pathvalidate \
python3dist-pathvalidate"

RDEPENDS:${PN} += "python-abi \
python311-setuptools"

inherit rpm
