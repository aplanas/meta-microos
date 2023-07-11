SUMMARY = "Python library to sanitize/validate a string such as filenames"
DESCRIPTION = "pathvalidate is a Python library to sanitize/validate a string such as \
filenames/file-paths/etc."
LICENSE = "MIT"

PV = "2.5.2"

RPM_NAME = "python310-pathvalidate-2.5.2-1.4.noarch.rpm"
RPM_HASH = "05cfe86221aa775e58db41f036002c6175ec11d6f571f4727440b75baaf1dec2cd48a92e3f42dbbfb07ba37fccc18bb1b524001d44230d5eca0b52b25030ce79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pathvalidate \
python310-pathvalidate \
python3dist-pathvalidate"

RDEPENDS:${PN} += "python-abi \
python310-setuptools"

inherit rpm
