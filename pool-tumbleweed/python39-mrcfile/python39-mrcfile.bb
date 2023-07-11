SUMMARY = "MRC file I/O library"
DESCRIPTION = "A Python implementation of the MRC2014 file format, which \
is used in structural biology to store image and volume data."
LICENSE = "BSD-3-Clause"

PV = "1.4.3"

RPM_NAME = "python39-mrcfile-1.4.3-2.3.noarch.rpm"
RPM_HASH = "1c32062ade537f011ae4c0cd7f44144d4c8738b75419e3a60ec372271af3cd90f443ad8a35308a4f26a1db43a87ba6e6fd8e94e27a2bd85550a1fc0062ca9857"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mrcfile \
python39-mrcfile \
python3dist-mrcfile"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-numpy \
update-alternatives"

inherit rpm
