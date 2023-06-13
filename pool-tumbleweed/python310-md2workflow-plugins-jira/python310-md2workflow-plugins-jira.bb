SUMMARY = "Jira plugin for md2workflow"
DESCRIPTION = "Jira plugin for md2workflow"
LICENSE = "GPL-3.0-only"

PV = "1.4.18"

RPM_NAME = "python310-md2workflow-plugins-jira-1.4.18-4.11.noarch.rpm"
RPM_HASH = "837dce015260982edc57b045ec354a4102799fd944a50d4279f9fd043a644ccbb9840cb389689db3c357e049b7ef62b9e31f0f7d0661ffea754383e84d8d1b40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-md2workflow-plugins-jira \
python310-md2workflow-plugins-jira"

RDEPENDS:${PN} += "python(abi) \
python310-jira \
python310-md2workflow"

inherit rpm
