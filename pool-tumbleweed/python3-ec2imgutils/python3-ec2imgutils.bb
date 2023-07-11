SUMMARY = "Image management utilities for AWS EC2"
DESCRIPTION = "A collection of image manipulation utilities for AWS EC2. These include: \
- ec2deprecateimg: Deprecates images by applying tags per convention \
- ec2publishimg: Set image visibility \
- ec2uploadimg: Upload an image to AWS EC2"
LICENSE = "GPL-3.0+"

PV = "10.0.2"

RPM_NAME = "python3-ec2imgutils-10.0.2-1.2.noarch.rpm"
RPM_HASH = "20fbcce9d4ebe387a6cc4f6e2a250cb38c552e10291617113b6b45224c01953dd58781e6cb12f413f494420df3fb10d974f9d5755d39bce81cc81df0a6f4a25b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-ec2deprecateimg \
python-ec2publishimg \
python-ec2uploadimg \
python-ec2utilsbase \
python3-ec2deprecateimg \
python3-ec2imgutils \
python3-ec2publishimg \
python3-ec2uploadimg \
python3-ec2utilsbase \
python3.11dist-ec2imgutils \
python3dist-ec2imgutils"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3 \
python3-boto3 \
python3-dateutil \
python3-paramiko"

inherit rpm
