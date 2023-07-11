SUMMARY = "Microsoft Azure HDInsight Management Client Library"
DESCRIPTION = "This is the Microsoft Azure HDInsight Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "9.0.0"

RPM_NAME = "python311-azure-mgmt-hdinsight-9.0.0-1.9.noarch.rpm"
RPM_HASH = "2f52f0a05525e1da2f0de77a60dbb5471d0d563b426301886bb3b4c7952604ee7ee8633bf760912e45fccf2a98452facd551a7cbd0dd9070f44ee487e092dace"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-hdinsight \
python3.11dist-azure-mgmt-hdinsight \
python311-azure-mgmt-hdinsight \
python3dist-azure-mgmt-hdinsight"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
