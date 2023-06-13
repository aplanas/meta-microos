SUMMARY = "Widget to display number of pending tasks in TaskWarrior"
DESCRIPTION = "Widget to displays the number of pending tasks in TaskWarrior."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-taskwarrior-2.1.5-3.3.noarch.rpm"
RPM_HASH = "bfee8529817014d43b9ac1404080b58cd41a345239e214484c3cc17e16a6a82ff4f23bdb9437b23b3e98ae709cedd16f6ad6fb6d379f3234be3484f25a60acef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-taskwarrior"

RDEPENDS:${PN} += "bumblebee-status \
python3-taskw"

inherit rpm
