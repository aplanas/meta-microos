SUMMARY = "Python retry decorator"
DESCRIPTION = "Easy to use retry decorator."
LICENSE = "Apache-2.0"

PV = "0.9.2"

RPM_NAME = "python310-retry-0.9.2-3.8.noarch.rpm"
RPM_HASH = "87cada950deedcd64ad38c1227ef422d3167381e1621849d3c0fb73038981832082172e3889b63d8968279938e3cf717f6004c418829c5e8f986e3bca973c11b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-retry \
python310-retry \
python3dist-retry"

RDEPENDS:${PN} += "python-abi \
python310-decorator \
python310-py"

inherit rpm
