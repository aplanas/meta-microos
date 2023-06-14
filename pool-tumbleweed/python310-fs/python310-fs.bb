SUMMARY = "Python's filesystem abstraction layer"
DESCRIPTION = "PyFilesystem is an abstraction layer for filesystems. In the same way that \
Python's file-like objects provide a common way of accessing files, \
PyFilesystem provides a common way of accessing entire filesystems. You can \
write platform-independent code to work with local files, that also works with \
any of the supported filesystems (zip, ftp, S3 etc.)."
LICENSE = "MIT"

PV = "2.4.16"

RPM_NAME = "python310-fs-2.4.16-2.1.noarch.rpm"
RPM_HASH = "32ca9bc8024d05b69ad0b845127e62568522578fb3c4ed83d2a43b55e83826771904d3b6344de40d076bb0167ec17d45942afdb6f19095c96bfaf0e4bcb137d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fs \
python3.10dist-fs \
python310-fs \
python3dist-fs"

RDEPENDS:${PN} += "python-abi \
python310-appdirs \
python310-psutil \
python310-pytz \
python310-setuptools \
python310-six"

inherit rpm
