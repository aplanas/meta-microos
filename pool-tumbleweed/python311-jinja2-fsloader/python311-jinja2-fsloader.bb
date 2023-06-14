SUMMARY = "Jinja2 template loader using PyFilesystem2"
DESCRIPTION = "This library allows using PyFilesystem2 as a backend to load \
templates into Jinja2. You can take advantage of the whole fs \
ecosystem, which already implements drivers for FTP, SSH, SMB, S3, \
WebDAV servers, ZIP and Tar archives and others."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python311-jinja2-fsloader-0.3.0-3.6.noarch.rpm"
RPM_HASH = "0b13383d8a200048747a8e6d8ec5acc5a010439736daca4f35f2471861ee7980c77ebb72bfe35ae0abb79de602876192fecf8b1fd19593ff3787c3fc79563797"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-jinja2-fsloader \
python311-jinja2-fsloader \
python3dist-jinja2-fsloader"

RDEPENDS:${PN} += "python-abi \
python311-Jinja2 \
python311-fs"

inherit rpm
