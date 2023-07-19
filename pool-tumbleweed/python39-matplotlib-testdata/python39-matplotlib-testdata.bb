SUMMARY = "Test data for python39-matplotlib"
DESCRIPTION = "This package includes the test baseline data \
for the python39-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python39-matplotlib-testdata-3.6.3-3.1.aarch64.rpm"
RPM_HASH = "d6045583066d6aa6c32e7c76231f631bc15257ea43cb7d20d64d29ddb9406b0f1d27c9ac1800377832b8dae124f41f88609cf80cb704fd44eb3f42b6ffd72aa6"

RPROVIDES:${PN} += "python39-matplotlib-testdata"

RDEPENDS:${PN} += "python-abi \
python39-matplotlib"

inherit rpm
