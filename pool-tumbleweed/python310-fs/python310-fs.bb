SUMMARY = "Python's filesystem abstraction layer"
DESCRIPTION = "PyFilesystem is an abstraction layer for filesystems. In the same way that \
Python's file-like objects provide a common way of accessing files, \
PyFilesystem provides a common way of accessing entire filesystems. You can \
write platform-independent code to work with local files, that also works with \
any of the supported filesystems (zip, ftp, S3 etc.)."
LICENSE = "MIT"

PV = "2.4.16"

RPM_NAME = "python310-fs-2.4.16-2.3.noarch.rpm"
RPM_HASH = "f0940ddd31dbb4500fcab2fd9401537fb6ddb76fe33bf022c3b59ed7a99dc0a9b5e61743541dc8b378adcf8ffc44593a35a14dd5d43b63d02bcac36b0a5e9cf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-fs \
python310-fs \
python3dist-fs"

RDEPENDS:${PN} += "python-abi \
python310-appdirs \
python310-psutil \
python310-pytz \
python310-setuptools \
python310-six"

inherit rpm
