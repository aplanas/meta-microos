SUMMARY = "Python's filesystem abstraction layer"
DESCRIPTION = "PyFilesystem is an abstraction layer for filesystems. In the same way that \
Python's file-like objects provide a common way of accessing files, \
PyFilesystem provides a common way of accessing entire filesystems. You can \
write platform-independent code to work with local files, that also works with \
any of the supported filesystems (zip, ftp, S3 etc.)."
LICENSE = "MIT"

PV = "2.4.16"

RPM_NAME = "python39-fs-2.4.16-2.3.noarch.rpm"
RPM_HASH = "f5b7f4e129f437ed19bf7ec5c97ea3a25e10fbad04138ce5940a2162356eb0d17749c711fc54d34e754e6b8a5e70cadf2679cd3db85318a0b056a814fbaf2eac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-fs \
python39-fs \
python3dist-fs"

RDEPENDS:${PN} += "python-abi \
python39-appdirs \
python39-psutil \
python39-pytz \
python39-setuptools \
python39-six"

inherit rpm
