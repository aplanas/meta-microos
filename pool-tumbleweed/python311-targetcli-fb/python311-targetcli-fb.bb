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

RPM_NAME = "python311-targetcli-fb-2.1.56-1.3.noarch.rpm"
RPM_HASH = "92a03d598979234a76496e24c8384901b292490b3aa28fa20ebf059abaad58c9a81c835294f89f534454337d761f0c4df73dbb48f331ead777a458193ce44705"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-targetcli-fb \
python3.11dist-targetcli-fb \
python311-targetcli-fb \
python3dist-targetcli-fb \
targetcli \
targetcli-fb"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-configshell-fb \
python311-dbus-python \
python311-rtslib-fb \
python311-six \
targetcli-fb-common \
update-alternatives"

inherit rpm
