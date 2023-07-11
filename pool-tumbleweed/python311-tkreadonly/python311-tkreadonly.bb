SUMMARY = "A set of Tkinter widgets to display readonly text and code"
DESCRIPTION = "A set of Tkinter widgets to display readonly text and code."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "python311-tkreadonly-0.6.1-2.13.noarch.rpm"
RPM_HASH = "e5dae2c47d18df085315c5b0b6af259be7662425f2fd73552b03b415f55e24141bc7db23142d455eccdb6f234ec2a42559499ad913988bd17b2b57f22f8b0633"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tkreadonly \
python3.11dist-tkreadonly \
python311-tkreadonly \
python3dist-tkreadonly"

RDEPENDS:${PN} += "python-abi \
python311-Pygments \
python311-idle \
python311-tk"

inherit rpm
