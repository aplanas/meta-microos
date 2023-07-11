SUMMARY = "Redmine plugin for md2workflow"
DESCRIPTION = "Redmine plugin for md2workflow"
LICENSE = "GPL-3.0-only"

PV = "1.4.18"

RPM_NAME = "python39-md2workflow-plugins-redmine-1.4.18-4.13.noarch.rpm"
RPM_HASH = "09ca5b1fb2a63e09cc2d3c51293bd9eac78e432454ebf6ccb4411f3f3a7da6c310a06a63cddf58352261a353562c79ceaa4a96e98333706811851d6c004c60d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-md2workflow-plugins-redmine"

RDEPENDS:${PN} += "python-abi \
python39-md2workflow \
python39-python-redmine"

inherit rpm
