SUMMARY = "Collect instance metadata in EC2"
DESCRIPTION = "Collect instance meta data in Amazon Compute CLoud instances"
LICENSE = "GPL-3.0-or-later"

PV = "4.0.0"

RPM_NAME = "python3-ec2metadata-4.0.0-1.2.noarch.rpm"
RPM_HASH = "1592021c543d82e958f8f5f15b75ef27af0539fea4403cf71bce77047ce41d58dc9ff093c0553fcf4a81ec10a974789f4197af14839dcffc48f5c59f6bb1f39f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-ec2metadata \
python3-ec2metadata \
python3.10dist-ec2metadata \
python3dist-ec2metadata"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3"

inherit rpm
