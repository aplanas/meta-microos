SUMMARY = "Jinja2 template loader using PyFilesystem2"
DESCRIPTION = "This library allows using PyFilesystem2 as a backend to load \
templates into Jinja2. You can take advantage of the whole fs \
ecosystem, which already implements drivers for FTP, SSH, SMB, S3, \
WebDAV servers, ZIP and Tar archives and others."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python39-jinja2-fsloader-0.3.0-3.6.noarch.rpm"
RPM_HASH = "906e6c07be0d5cc576c450c36a856db97d07619c9613f9d4386ff1a623a44f4268e969eaacb19b840a68806aa8484d0986aad6b28bab33f39e52452d7a447eb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jinja2-fsloader) \
python39-jinja2-fsloader \
python3dist(jinja2-fsloader)"
RDEPENDS:${PN} += "python(abi) \
python39-Jinja2 \
python39-fs"

inherit rpm
