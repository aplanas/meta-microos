SUMMARY = "Command line utility to show dependency tree of packages"
DESCRIPTION = "Command line utility to show dependency tree of packages."
LICENSE = "MIT"

PV = "2.7.1"

RPM_NAME = "python39-pipdeptree-2.7.1-1.3.noarch.rpm"
RPM_HASH = "582d1c95e846baa8d17dd892c935596cac9876a317274241cba2736a30bf43b5fc45b378f329184a1853929305b6a6c7f8d5af4bc014dd01880de777c509a993"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pipdeptree \
python39-pipdeptree \
python3dist-pipdeptree"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-pip \
update-alternatives"

inherit rpm
