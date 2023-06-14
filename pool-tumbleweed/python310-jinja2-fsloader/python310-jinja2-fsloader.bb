SUMMARY = "Jinja2 template loader using PyFilesystem2"
DESCRIPTION = "This library allows using PyFilesystem2 as a backend to load \
templates into Jinja2. You can take advantage of the whole fs \
ecosystem, which already implements drivers for FTP, SSH, SMB, S3, \
WebDAV servers, ZIP and Tar archives and others."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python310-jinja2-fsloader-0.3.0-3.6.noarch.rpm"
RPM_HASH = "9b0706cf5819cacadce59a346b77b67df8bed27a80fdcd0f36dea22a860e4e463eff4bdf9f1b27ed502a278ec82aac66dcc66a9ba041754cd22ec680b54c227b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jinja2-fsloader \
python3.10dist-jinja2-fsloader \
python310-jinja2-fsloader \
python3dist-jinja2-fsloader"

RDEPENDS:${PN} += "python-abi \
python310-Jinja2 \
python310-fs"

inherit rpm
