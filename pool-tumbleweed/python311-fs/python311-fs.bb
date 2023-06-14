SUMMARY = "Python's filesystem abstraction layer"
DESCRIPTION = "PyFilesystem is an abstraction layer for filesystems. In the same way that \
Python's file-like objects provide a common way of accessing files, \
PyFilesystem provides a common way of accessing entire filesystems. You can \
write platform-independent code to work with local files, that also works with \
any of the supported filesystems (zip, ftp, S3 etc.)."
LICENSE = "MIT"

PV = "2.4.16"

RPM_NAME = "python311-fs-2.4.16-2.1.noarch.rpm"
RPM_HASH = "14dd68393b608d75fd7cba6b52d4cf4e8dea48598a8fbecc8aadc5558c39449b0553466d911db63c3e821136e9d3d12c9a6f51a74660566352e876275fb35dbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-fs \
python311-fs \
python3dist-fs"

RDEPENDS:${PN} += "python-abi \
python311-appdirs \
python311-psutil \
python311-pytz \
python311-setuptools \
python311-six"

inherit rpm
