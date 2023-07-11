SUMMARY = "Microsoft Azure HDInsight Management Client Library"
DESCRIPTION = "This is the Microsoft Azure HDInsight Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "9.0.0"

RPM_NAME = "python39-azure-mgmt-hdinsight-9.0.0-1.9.noarch.rpm"
RPM_HASH = "f273f6c5cc99d8bd90f48e54a72ed56183d07664d4d9af6725f4cb8cca485996ec334cbaad07016351ab91ab0a9cc783df93d5b6adc0bbe563569a192e45e73e"
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
