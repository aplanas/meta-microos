SUMMARY = "Parallel SSH to control large numbers of Machines simultaneously"
DESCRIPTION = "pssh provides parallel versions of the OpenSSH tools that are useful for \
controlling large numbers of machines simultaneously. It includes parallel \
versions of ssh, scp, and rsync, as well as a parallel kill command."
LICENSE = "BSD-3-Clause"

PV = "2.3.4+git10.d4909c9"

RPM_NAME = "pssh-2.3.4+git10.d4909c9-3.5.noarch.rpm"
RPM_HASH = "e844e08cf0eb2a5a3a5f901d9dce5de1390eca680c7e02c3ceb53d113451bb8f2cbf59512a9f222f121be37848eb4d66ca8a818e9977256cdd2cd4f55a4ead81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pssh"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-pssh"

inherit rpm
