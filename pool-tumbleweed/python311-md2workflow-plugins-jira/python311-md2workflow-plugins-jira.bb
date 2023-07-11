SUMMARY = "Jira plugin for md2workflow"
DESCRIPTION = "Jira plugin for md2workflow"
LICENSE = "GPL-3.0-only"

PV = "1.4.18"

RPM_NAME = "python311-md2workflow-plugins-jira-1.4.18-4.13.noarch.rpm"
RPM_HASH = "30be9426dd4dd97617f1626c631b62107d25c62696c9f5adb2bdfe871b29387cd3fb9d8380a3ba37686ddf53f3cb95c88f32440823ca8c897b5ffe5c064b635e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-md2workflow-plugins-jira \
python311-md2workflow-plugins-jira"

RDEPENDS:${PN} += "python-abi \
python311-jira \
python311-md2workflow"

inherit rpm
