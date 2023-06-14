SUMMARY = "Redmine plugin for md2workflow"
DESCRIPTION = "Redmine plugin for md2workflow"
LICENSE = "GPL-3.0-only"

PV = "1.4.18"

RPM_NAME = "python311-md2workflow-plugins-redmine-1.4.18-4.11.noarch.rpm"
RPM_HASH = "3c49b013b1131d37b5a8c8ba4f9c497aeb90e7d5b0ed0c8534753d2d3dc3ad86285587b218a77eb1fee9152f902860ff7d0fa76c606831dde73aec7c78a594f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-md2workflow-plugins-redmine"

RDEPENDS:${PN} += "python-abi \
python311-md2workflow \
python311-python-redmine"

inherit rpm
