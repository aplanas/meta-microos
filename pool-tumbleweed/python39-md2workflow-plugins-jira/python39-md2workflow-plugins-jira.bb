SUMMARY = "Jira plugin for md2workflow"
DESCRIPTION = "Jira plugin for md2workflow"
LICENSE = "GPL-3.0-only"

PV = "1.4.18"

RPM_NAME = "python39-md2workflow-plugins-jira-1.4.18-4.11.noarch.rpm"
RPM_HASH = "0740ca009e44db230a365f90f1e622a569d26a2fe1712d9551e564fa1336ed25de6aadb59b74111691d436d075336fae4bb867d0a1e64ba30ca56d4271e29a3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-md2workflow-plugins-jira"

RDEPENDS:${PN} += "python-abi \
python39-jira \
python39-md2workflow"

inherit rpm
