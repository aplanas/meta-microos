SUMMARY = "Microsoft Azure HDInsight Management Client Library"
DESCRIPTION = "This is the Microsoft Azure HDInsight Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "9.0.0"

RPM_NAME = "python39-azure-mgmt-hdinsight-9.0.0-1.8.noarch.rpm"
RPM_HASH = "bb336853735b03366e90627d470e39ac30c9716e74ae3dfc87e655886b5676d52dd7ddb28817f9707de3de38d95621132e745e5a6bbbd386b10a8cbc72526887"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-hdinsight \
python39-azure-mgmt-hdinsight \
python3dist-azure-mgmt-hdinsight"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
