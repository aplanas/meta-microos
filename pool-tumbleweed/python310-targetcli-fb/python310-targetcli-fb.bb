SUMMARY = "A command shell for managing the Linux LIO kernel target"
DESCRIPTION = "targetcli-fb is a command-line interface for configuring the LIO generic \
SCSI target, present in 3.x Linux kernel versions. \
 \
targetcli-fb is a fork of the 'targetcli' code written by RisingTide Systems. \
The '-fb' differentiates between the original and this version. Please ensure \
to use either all 'fb' versions of the targetcli components -- targetcli, \
rtslib, and configshell, or stick with all non-fb versions, since they are \
no longer strictly compatible."
LICENSE = "Apache-2.0"

PV = "2.1.56"

RPM_NAME = "python310-targetcli-fb-2.1.56-1.3.noarch.rpm"
RPM_HASH = "bdf22364dc4b9725f1d1265dcfd2c5732bc6ddc125a1ab36c95c09c18338d902ed2214c7423f6f134461336c37ddb8ad93d4bf714c4e852db62b62c105911314"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-targetcli-fb \
python310-targetcli-fb \
python3dist-targetcli-fb"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-configshell-fb \
python310-dbus-python \
python310-rtslib-fb \
python310-six \
targetcli-fb-common \
update-alternatives"

inherit rpm
