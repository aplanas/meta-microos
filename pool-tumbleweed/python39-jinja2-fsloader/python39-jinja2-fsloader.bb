SUMMARY = "Jinja2 template loader using PyFilesystem2"
DESCRIPTION = "This library allows using PyFilesystem2 as a backend to load \
templates into Jinja2. You can take advantage of the whole fs \
ecosystem, which already implements drivers for FTP, SSH, SMB, S3, \
WebDAV servers, ZIP and Tar archives and others."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python39-jinja2-fsloader-0.3.0-3.8.noarch.rpm"
RPM_HASH = "242a77318afb33f6c4a73aa701a0dd9d24ee8b36e2ebb6b5a26ebd3a29c7026d77e8eff0062d451debf2cac2821f7d1c6938b28c7fdb1118a8775ae68166ed31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jinja2-fsloader \
python39-jinja2-fsloader \
python3dist-jinja2-fsloader"

RDEPENDS:${PN} += "python-abi \
python39-Jinja2 \
python39-fs"

inherit rpm
