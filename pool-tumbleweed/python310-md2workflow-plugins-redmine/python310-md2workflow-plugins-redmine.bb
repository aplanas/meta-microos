SUMMARY = "Redmine plugin for md2workflow"
DESCRIPTION = "Redmine plugin for md2workflow"
LICENSE = "GPL-3.0-only"

PV = "1.4.18"

RPM_NAME = "python310-md2workflow-plugins-redmine-1.4.18-4.13.noarch.rpm"
RPM_HASH = "749b897e69991c8fc91d6179011c5767184499ca95616c17fcb76aa78befe564584383a56f8bf7e53b83b989bebfb7ee74e57686b1dfcfb62fed8692c22b7d06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-md2workflow-plugins-redmine"

RDEPENDS:${PN} += "python-abi \
python310-md2workflow \
python310-python-redmine"

inherit rpm
