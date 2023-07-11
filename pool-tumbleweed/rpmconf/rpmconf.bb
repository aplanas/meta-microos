SUMMARY = "Tool to handle rpmnew and rpmsave files"
DESCRIPTION = "This tool search for .rpmnew, .rpmsave and .rpmorig files and ask \
you what to do with them: \
Keep current version, place back old version, watch the diff or merge."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.9"

RPM_NAME = "rpmconf-1.1.9-1.2.noarch.rpm"
RPM_HASH = "6298e0b7213e146562bec5b9238d895dd3820fb875f35798a60a48d1d91a189946c728662b47bdc9ceda5fd213a380ffcc902ba70be285d5b94cdd2378c7551d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpmconf"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-rpm \
python3-rpmconf"

inherit rpm
