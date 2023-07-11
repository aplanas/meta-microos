SUMMARY = "Python module to convert voluptuous schemas to dictionaries"
DESCRIPTION = "A Python module to convert voluptuous schemas to dictionaries."
LICENSE = "Apache-2.0"

PV = "2.5.0"

RPM_NAME = "python311-voluptuous-serialize-2.5.0-1.5.noarch.rpm"
RPM_HASH = "d538521f0328e16efcb44f889a3b5ede2abcdb22ec2848cca1fe66bfb5f835bac1912d77ae46287c4cbd43718550c89fa07850944a6c423dbe8df4ca705eab91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-voluptuous-serialize \
python3.11dist-voluptuous-serialize \
python311-voluptuous-serialize \
python3dist-voluptuous-serialize"

RDEPENDS:${PN} += "python-abi \
python311-voluptuous"

inherit rpm
