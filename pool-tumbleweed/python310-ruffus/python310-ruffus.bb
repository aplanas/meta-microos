SUMMARY = "Python computational pipeline management package"
DESCRIPTION = "The Ruffus module is a way to add support for running computational pipelines."
LICENSE = "MIT"

PV = "2.8.4"

RPM_NAME = "python310-ruffus-2.8.4-2.7.noarch.rpm"
RPM_HASH = "f2eaf1c4924a18f6b0e06866704ce0afd6eaf2410a5ab68b5ee141ec86217e84c048fd99572176125ec7fd59de0f8deeb577d2040d9f81a4acfa8cf4c8438d91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ruffus \
python310-ruffus \
python3dist-ruffus"

RDEPENDS:${PN} += "python-abi"

inherit rpm
