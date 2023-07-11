SUMMARY = "Python's filesystem abstraction layer"
DESCRIPTION = "PyFilesystem is an abstraction layer for filesystems. In the same way that \
Python's file-like objects provide a common way of accessing files, \
PyFilesystem provides a common way of accessing entire filesystems. You can \
write platform-independent code to work with local files, that also works with \
any of the supported filesystems (zip, ftp, S3 etc.)."
LICENSE = "MIT"

PV = "2.4.16"

RPM_NAME = "python311-fs-2.4.16-2.3.noarch.rpm"
RPM_HASH = "68842ca42fcf694203c860ae485d271220a0f90ff68ed44cfda1ff9f47438971511ad32a70d747e07cf798a11b8be7869c335ab9131b60b5c27a1343b8a87132"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fs \
python3.11dist-fs \
python311-fs \
python3dist-fs"

RDEPENDS:${PN} += "python-abi \
python311-appdirs \
python311-psutil \
python311-pytz \
python311-setuptools \
python311-six"

inherit rpm
