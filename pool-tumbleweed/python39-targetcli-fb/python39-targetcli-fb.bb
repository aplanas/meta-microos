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

RPM_NAME = "python39-targetcli-fb-2.1.56-1.3.noarch.rpm"
RPM_HASH = "22340318ae6b438f81ed655cb11fb7db178735fde0d9a29f3b44a87ab4bebee32dfbd31ebd559a89cf263bbd076213cdcdeb97ac052b9ddc718530dfdad77cd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-targetcli-fb \
python39-targetcli-fb \
python3dist-targetcli-fb"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-configshell-fb \
python39-dbus-python \
python39-rtslib-fb \
python39-six \
targetcli-fb-common \
update-alternatives"

inherit rpm
