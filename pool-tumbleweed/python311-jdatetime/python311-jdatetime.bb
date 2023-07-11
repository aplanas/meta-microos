SUMMARY = "Jalali datetime binding for python"
DESCRIPTION = "jdatetime is the Jalali implementation of Python's datetime module."
LICENSE = "Python-2.0"

PV = "4.1.0"

RPM_NAME = "python311-jdatetime-4.1.0-1.6.noarch.rpm"
RPM_HASH = "2d84fd2da828961db701a109afdc11412b36c51d14da72bbe7acc0aaf6efe5e6ddb0948c569a6470bf1a5954797374b7f55825b82e2f15e2b02a1c7ea1295a97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jdatetime \
python3.11dist-jdatetime \
python311-jdatetime \
python3dist-jdatetime"

RDEPENDS:${PN} += "python-abi"

inherit rpm
