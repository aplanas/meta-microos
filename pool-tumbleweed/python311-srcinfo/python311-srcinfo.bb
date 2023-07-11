SUMMARY = "Python library to parse Arch SRCINFO files"
DESCRIPTION = "Python library to parse Arch .SRCINFO files."
LICENSE = "ISC"

PV = "0.1.1"

RPM_NAME = "python311-srcinfo-0.1.1-1.6.noarch.rpm"
RPM_HASH = "0ac7a6a11626842950695aa283685264299931e6f3d037918a066d0ecdd1394b449336cf08294b1f12e98769c82d420617757a951a792e3246499566cdb423e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-srcinfo \
python3.11dist-srcinfo \
python311-srcinfo \
python3dist-srcinfo"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-parse \
update-alternatives"

inherit rpm
