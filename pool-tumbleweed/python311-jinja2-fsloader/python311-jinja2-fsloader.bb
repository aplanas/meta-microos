SUMMARY = "Jinja2 template loader using PyFilesystem2"
DESCRIPTION = "This library allows using PyFilesystem2 as a backend to load \
templates into Jinja2. You can take advantage of the whole fs \
ecosystem, which already implements drivers for FTP, SSH, SMB, S3, \
WebDAV servers, ZIP and Tar archives and others."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python311-jinja2-fsloader-0.3.0-3.8.noarch.rpm"
RPM_HASH = "4049faf161462334893ba203ebce54bbccb32f65c367be0809c6fb6b33ba9a54adf54b4375c6fe17eba1778b3d7e86ce620bac6a481f08efcf2a7d500ac6a020"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jinja2-fsloader \
python3.11dist-jinja2-fsloader \
python311-jinja2-fsloader \
python3dist-jinja2-fsloader"

RDEPENDS:${PN} += "python-abi \
python311-Jinja2 \
python311-fs"

inherit rpm
