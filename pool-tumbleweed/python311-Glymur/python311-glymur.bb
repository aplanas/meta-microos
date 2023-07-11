SUMMARY = "Tools for accessing JPEG2000 files"
DESCRIPTION = "Python interface to the OpenJPEG library"
LICENSE = "MIT"

PV = "0.11.3"

RPM_NAME = "python311-Glymur-0.11.3-1.6.noarch.rpm"
RPM_HASH = "2b790fc3594dae46f0a74f7e0589b55f6efe24ac60bcb96b4f2a10a41efcbbf22624af42068d07d222416feb3161baec9b76dc4da6e652c1a2ba01ee5e46702d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Glymur \
python3.11dist-glymur \
python311-Glymur \
python3dist-glymur"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-lxml \
python311-numpy \
python311-packaging \
update-alternatives"

inherit rpm
