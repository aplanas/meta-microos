SUMMARY = "A library to calculate python dependency graphs"
DESCRIPTION = "A library to calculate python dependency graphs."
LICENSE = "Apache-2.0"

PV = "0.8"

RPM_NAME = "python39-importlab-0.8-1.6.noarch.rpm"
RPM_HASH = "5becbb0c829b509fca1c6f75082a4c212098cd83cc9ff5ea44aea3e1decfb96639d09490dee11b55377a1cccf25bda14efaff3a8d6e8b5d1f3bf80d0e7b4c29a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-importlab \
python39-importlab \
python3dist-importlab"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-networkx \
update-alternatives"

inherit rpm
