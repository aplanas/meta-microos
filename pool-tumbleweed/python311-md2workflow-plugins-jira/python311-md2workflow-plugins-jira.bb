SUMMARY = "Jira plugin for md2workflow"
DESCRIPTION = "Jira plugin for md2workflow"
LICENSE = "GPL-3.0-only"

PV = "1.4.18"

RPM_NAME = "python311-md2workflow-plugins-jira-1.4.18-4.11.noarch.rpm"
RPM_HASH = "95e12b34b187d663e0c558188fd075263e0f18e49422367a393b291501014ab62fbd0977a798a5d1b354b8a5ef009b8a1938b475a86f0739830d53d23fde03a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-md2workflow-plugins-jira"

RDEPENDS:${PN} += "python-abi \
python311-jira \
python311-md2workflow"

inherit rpm
