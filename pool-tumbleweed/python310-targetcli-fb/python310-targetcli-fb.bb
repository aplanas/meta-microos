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

PV = "2.1.54"

RPM_NAME = "python310-targetcli-fb-2.1.54-2.1.noarch.rpm"
RPM_HASH = "66efd99cfd58a6bf38c43366c7c9f4895d921fec267f8f56d057b76f9e1391957d8fce5e72787eeddd4562809581ad0302a53aba197b8d6ecee4b10dad4f4618"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-targetcli-fb \
python3.10dist(targetcli-fb) \
python310-targetcli-fb \
python3dist(targetcli-fb) \
targetcli \
targetcli-fb"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-configshell-fb \
python310-dbus-python \
python310-rtslib-fb \
python310-six \
targetcli-fb-common \
update-alternatives"

inherit rpm
