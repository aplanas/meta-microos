SUMMARY = "URI Template Expansison"
DESCRIPTION = "This is a Python implementation of RFC6570, URI Template, and can expand \
templates up to and including Level 4 in that specification"
LICENSE = "Apache-2.0"

PV = "4.1.1"

RPM_NAME = "python311-uritemplate-4.1.1-3.1.noarch.rpm"
RPM_HASH = "52af4dfa054ae27ccc95ec23fc735af8b855b08a10123627a69d6a29e67977d601a12c70ea063eebf69ce148104ed493e84b65e718e63c1cf8b6a59528028e70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-uritemplate \
python3.11dist-uritemplate \
python311-uritemplate \
python3dist-uritemplate"

RDEPENDS:${PN} += "python-abi"

inherit rpm
