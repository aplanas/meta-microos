SUMMARY = "Python utility for HTCondor"
DESCRIPTION = "PyCondor (Python HTCondor) is a tool to help build and submit workflows to HTCondor in a straight-forward manner with minimal hassle."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python310-PyCondor-0.6.0-1.6.noarch.rpm"
RPM_HASH = "d3b68f8480371a8539e50bb7db2e90645fe25fd56166738212c6661322c5732c4c71570e8fccf61c8fa84ef154881e7bf36d971e869a18d99332de8817028627"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pycondor \
python310-PyCondor \
python3dist-pycondor"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
