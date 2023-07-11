SUMMARY = "Python libraries for Pacemaker"
DESCRIPTION = "Pacemaker is an advanced, scalable High-Availability cluster resource \
manager. \
 \
The python3-pacemaker package contains a Python library that can be used \
to interface with Pacemaker."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.1.6+20230524.6fdc9deea"

RPM_NAME = "python3-pacemaker-2.1.6+20230524.6fdc9deea-1.1.noarch.rpm"
RPM_HASH = "ebf20c382ec2e5baaad0667976c41c255d26fc73e2b925648cf9c2470b013f061e435976ef9fefc677e0a6140d645c62e93f0180b7676e9315a3be4dc210f739"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pacemaker \
python3.11dist-pacemaker \
python3dist-pacemaker"

RDEPENDS:${PN} += "pacemaker-libs \
python-abi \
python3"

inherit rpm
