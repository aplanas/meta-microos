SUMMARY = "Collect instance metadata in EC2"
DESCRIPTION = "Collect instance meta data in Amazon Compute CLoud instances"
LICENSE = "GPL-3.0-or-later"

PV = "5.0.0"

RPM_NAME = "python3-ec2metadata-5.0.0-1.1.noarch.rpm"
RPM_HASH = "a2c771181761a1ce3b8c8b5938cb97a140fa3dc78ffb825eaa8780e3eca415b0c2e78afde0551f9bde36e008e188d2a658d55b62edf01ffc83036e5cdbbcbc04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-ec2metadata \
python3-ec2metadata \
python3.11dist-ec2metadata \
python3dist-ec2metadata"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3"

inherit rpm
