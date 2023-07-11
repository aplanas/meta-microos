SUMMARY = "Jinja2 template loader using PyFilesystem2"
DESCRIPTION = "This library allows using PyFilesystem2 as a backend to load \
templates into Jinja2. You can take advantage of the whole fs \
ecosystem, which already implements drivers for FTP, SSH, SMB, S3, \
WebDAV servers, ZIP and Tar archives and others."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python310-jinja2-fsloader-0.3.0-3.8.noarch.rpm"
RPM_HASH = "9100ea162c5b8a8e70180aae0d6d1ec123d09b9bcb9eaaac43ecbc569e83cee89fbd115ec0c07c8f2a0bcb31a8bf0213481c28c360c45d0fc5be366e57204dc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jinja2-fsloader \
python310-jinja2-fsloader \
python3dist-jinja2-fsloader"

RDEPENDS:${PN} += "python-abi \
python310-Jinja2 \
python310-fs"

inherit rpm
