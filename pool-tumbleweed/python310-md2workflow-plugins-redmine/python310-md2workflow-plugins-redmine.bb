SUMMARY = "Redmine plugin for md2workflow"
DESCRIPTION = "Redmine plugin for md2workflow"
LICENSE = "GPL-3.0-only"

PV = "1.4.18"

RPM_NAME = "python310-md2workflow-plugins-redmine-1.4.18-4.11.noarch.rpm"
RPM_HASH = "cc78ee19a874eac2c560dad05858d04ef0dd23af025582ad36e1e6738210b4ef907bfb28a22f51ef941ff374b718c71d7c0b4cc1a8b06f376aca545e5eac4381"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-md2workflow-plugins-redmine \
python310-md2workflow-plugins-redmine"

RDEPENDS:${PN} += "python(abi) \
python310-md2workflow \
python310-python-redmine"

inherit rpm
