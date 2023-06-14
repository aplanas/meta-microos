SUMMARY = "Boilerplate-free configuration with env variables"
DESCRIPTION = "Boilerplate-free configuration with env variables."
LICENSE = "MIT"

PV = "23.2.0"

RPM_NAME = "python311-environ-config-23.2.0-1.1.noarch.rpm"
RPM_HASH = "cb1e08162bd9dc381059dd7eaecce98250d979146f29fbf63ce252687a362ec983cb02bac8a85988dbe76f51c0587621ab09003c26ee342e90998fe0cd82f699"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-environ-config \
python311-environ-config \
python3dist-environ-config"

RDEPENDS:${PN} += "python-abi \
python311-attrs"

inherit rpm
