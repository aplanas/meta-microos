SUMMARY = "Collect instance metadata in EC2"
DESCRIPTION = "Collect instance meta data in Amazon Compute CLoud instances"
LICENSE = "GPL-3.0-or-later"

PV = "4.0.0"

RPM_NAME = "python3-ec2metadata-4.0.0-1.3.noarch.rpm"
RPM_HASH = "6d1da7362377ba99790c7ebb8e562948b2f260a34d7905605896d7900ff6bc1f13c385a85719b713ac4c5dec0094dcaff07bc61f873e648c4e5e4236d3d41739"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-ec2metadata \
python3-ec2metadata \
python3.11dist-ec2metadata \
python3dist-ec2metadata"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3"

inherit rpm
