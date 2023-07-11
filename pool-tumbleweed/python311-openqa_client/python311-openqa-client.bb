SUMMARY = "Python openQA client library"
DESCRIPTION = "This is a client for the openQA API, based on requests."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.1"

RPM_NAME = "python311-openqa_client-4.2.1-1.5.noarch.rpm"
RPM_HASH = "356074d88875ee68860697862c4db48666feaf530f1800689302a4470c7ad2e2cd76012de49fafc2bcc4e32fa2c8e40c3a21924499db5fc3efe849aaeac6a693"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openqa-client \
python3.11dist-openqa-client \
python311-openqa-client \
python3dist-openqa-client"

RDEPENDS:${PN} += "python-abi \
python311-PyYAML \
python311-requests \
python311-typing-extensions"

inherit rpm
