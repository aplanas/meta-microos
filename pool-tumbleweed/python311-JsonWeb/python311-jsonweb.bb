SUMMARY = "Add JSON (de)serialization to your python objects"
DESCRIPTION = "Quickly add json serialization and deserialization \
to your python classes."
LICENSE = "BSD-3-Clause"

PV = "0.8.2"

RPM_NAME = "python311-JsonWeb-0.8.2-6.1.noarch.rpm"
RPM_HASH = "6db3ec01160d0977dc175682a4e3276d83688011a2a5b536902b466702c42f71308314d9827830a861a5b560a88809d50f945431dc3cb73c9ce635f60a9d4573"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-jsonweb \
python311-JsonWeb \
python3dist-jsonweb"

RDEPENDS:${PN} += "python-abi"

inherit rpm
