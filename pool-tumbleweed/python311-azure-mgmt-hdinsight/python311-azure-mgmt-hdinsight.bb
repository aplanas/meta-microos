SUMMARY = "Microsoft Azure HDInsight Management Client Library"
DESCRIPTION = "This is the Microsoft Azure HDInsight Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "9.0.0"

RPM_NAME = "python311-azure-mgmt-hdinsight-9.0.0-1.8.noarch.rpm"
RPM_HASH = "5ff3257c476868f4fb1bdec5378b0749d781d3dd4880806d3b0191f601c77ce89d9df855fd018135022465acda24a9c2c7c2d13e0616f8eef05e0d7fcc2960a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-hdinsight \
python311-azure-mgmt-hdinsight \
python3dist-azure-mgmt-hdinsight"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
