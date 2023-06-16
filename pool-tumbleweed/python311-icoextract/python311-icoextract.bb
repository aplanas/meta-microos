SUMMARY = "Extract icons from Windows PE files (.exe/.dll)"
DESCRIPTION = "icoextract is an icon extractor for Windows PE files (.exe/.dll), written in \
Python. It also includes a thumbnailer script (exe-thumbnailer) for Linux \
desktops."
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "python311-icoextract-0.1.4-1.4.noarch.rpm"
RPM_HASH = "25eeb55d87cadcdf555e5d1f6ab0e3e1bb9b12bb3c0a4b463c7c9701277b5f6d2269f7b96ec55dfc004c228d265b4eaf1770656405b2f760387b68d759370b88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-icoextract \
python311-icoextract \
python3dist-icoextract"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-pefile \
update-alternatives"

inherit rpm
