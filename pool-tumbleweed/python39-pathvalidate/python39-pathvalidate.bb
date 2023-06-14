SUMMARY = "Python library to sanitize/validate a string such as filenames"
DESCRIPTION = "pathvalidate is a Python library to sanitize/validate a string such as \
filenames/file-paths/etc."
LICENSE = "MIT"

PV = "2.5.2"

RPM_NAME = "python39-pathvalidate-2.5.2-1.2.noarch.rpm"
RPM_HASH = "3d19c859eb01241b06d3234b90d0914be0bc2e7cc9fd4b32378c93f0a7bfd4fbeb9a07190be5ce78b22d7d3f610387cc782ecc3592a14fe5b89a1cbad285fdf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pathvalidate \
python39-pathvalidate \
python3dist-pathvalidate"

RDEPENDS:${PN} += "python-abi \
python39-setuptools"

inherit rpm
