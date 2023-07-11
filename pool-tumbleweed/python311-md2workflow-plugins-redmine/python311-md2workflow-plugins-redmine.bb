SUMMARY = "Redmine plugin for md2workflow"
DESCRIPTION = "Redmine plugin for md2workflow"
LICENSE = "GPL-3.0-only"

PV = "1.4.18"

RPM_NAME = "python311-md2workflow-plugins-redmine-1.4.18-4.13.noarch.rpm"
RPM_HASH = "e2977a6cbd1155d5949ad5ba5623f443828400e91d4bb7b5f2c57c340dbbc95b39b0f01403a82f9990cf607260a0ce2209dcaef7eea54c8516bf7d0e28f488e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-md2workflow-plugins-redmine \
python311-md2workflow-plugins-redmine"

RDEPENDS:${PN} += "python-abi \
python311-md2workflow \
python311-python-redmine"

inherit rpm
