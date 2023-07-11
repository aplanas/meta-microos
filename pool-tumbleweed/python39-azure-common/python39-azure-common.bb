SUMMARY = "Microsoft Azure common code"
DESCRIPTION = "This is the Microsoft Azure common code. \
 \
This package provides shared code by the Azure packages."
LICENSE = "MIT"

PV = "1.1.28"

RPM_NAME = "python39-azure-common-1.1.28-1.7.noarch.rpm"
RPM_HASH = "136a60c5a70db6df4e7549d3ee0b023f0af0618590134a613d5319a818a114821c009da8fefa8afff7b80608d7d0ff331aeb4c5c50ba6240e24a30dd1bcc9ccd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-common \
python39-azure-common \
python3dist-azure-common"

RDEPENDS:${PN} += "python-abi \
python39-azure-nspkg"

inherit rpm
