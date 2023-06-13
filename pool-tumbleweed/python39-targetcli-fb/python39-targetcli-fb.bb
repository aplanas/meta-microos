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

RPM_NAME = "python39-targetcli-fb-2.1.54-2.1.noarch.rpm"
RPM_HASH = "e70b956f387d10f3240d2fdefcb15dc6e10d92d8dc6e808292017f7b709f14acbd677cd23016f777c0c2df5202f23ea0c9e0f601c970d708b4b0e33caefaff30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(targetcli-fb) \
python39-targetcli-fb \
python3dist(targetcli-fb)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-configshell-fb \
python39-dbus-python \
python39-rtslib-fb \
python39-six \
targetcli-fb-common \
update-alternatives"

inherit rpm
