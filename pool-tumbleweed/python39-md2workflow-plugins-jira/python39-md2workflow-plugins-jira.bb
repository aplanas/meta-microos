SUMMARY = "Jira plugin for md2workflow"
DESCRIPTION = "Jira plugin for md2workflow"
LICENSE = "GPL-3.0-only"

PV = "1.4.18"

RPM_NAME = "python39-md2workflow-plugins-jira-1.4.18-4.13.noarch.rpm"
RPM_HASH = "a93bd5d91f989844a4b900f12d7967d25df089452f3a8a0203ff5e0826a33734a0a781243468404f857052ee93e1925f68108c418ca31994aa00286d12510eaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-md2workflow-plugins-jira"

RDEPENDS:${PN} += "python-abi \
python39-jira \
python39-md2workflow"

inherit rpm
