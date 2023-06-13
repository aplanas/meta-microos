SUMMARY = "Python openQA client library"
DESCRIPTION = "This is a client for the openQA API, based on requests."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.1"

RPM_NAME = "python311-openqa_client-4.2.1-1.3.noarch.rpm"
RPM_HASH = "30cc0b750844071b2a135e8f6c7892b6de04c13a883d693a30c409613184b2ac6c8d40408e34d3e4747dd773e1cdccceb6e35918c857c20a2a239c1db90e9d98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(openqa-client) \
python311-openqa_client \
python3dist(openqa-client)"

RDEPENDS:${PN} += "python(abi) \
python311-PyYAML \
python311-requests \
python311-typing_extensions"

inherit rpm
