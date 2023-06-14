SUMMARY = "Test data for python311-matplotlib"
DESCRIPTION = "This package includes the test baseline data \
for the python311-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python311-matplotlib-testdata-3.6.3-2.1.aarch64.rpm"
RPM_HASH = "512683956957f3369396df480a243c2e22b8cb1553113d1afcb2fd55d0239e898c3668fa4a9644cbaf2f1a5b6cc12dfd17458c2f296aa50867e02eaf4ba02daa"

RPROVIDES:${PN} += "python311-matplotlib-testdata"

RDEPENDS:${PN} += "python-abi \
python311-matplotlib"

inherit rpm
