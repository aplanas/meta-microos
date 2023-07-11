SUMMARY = "web.py: makes web apps"
DESCRIPTION = "Think about the ideal way to write a web app. Write the code to make it happen."
LICENSE = "BSD-3-Clause & SUSE-Public-Domain"

PV = "0.62"

RPM_NAME = "python39-web.py-0.62-3.10.noarch.rpm"
RPM_HASH = "ab9047304b238f4f7afe62bc25902a8681ad3857942107d1d0b0d69ebf65bd37cad32a5bc8f6ff7d0d6a02b4d0a2da9c6727c59e2dac452317b92276311d2a3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-web.py \
python39-web.py \
python3dist-web.py"

RDEPENDS:${PN} += "python-abi \
python39-cheroot"

inherit rpm
