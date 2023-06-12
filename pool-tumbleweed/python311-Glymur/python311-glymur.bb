SUMMARY = "Tools for accessing JPEG2000 files"
DESCRIPTION = "Python interface to the OpenJPEG library"
LICENSE = "MIT"

PV = "0.11.3"

RPM_NAME = "python311-Glymur-0.11.3-1.4.noarch.rpm"
RPM_HASH = "d07500dee7eb01936a1c2a5c09ba0cf8ed81a9b8205fc09a91c0af529705106ae0b0af88b86dd424613f3477788f42a77d79cad2fff57a34af5440cb0cbfd58c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(glymur) \
python311-Glymur \
python3dist(glymur)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-lxml \
python311-numpy \
python311-packaging \
update-alternatives"

inherit rpm
