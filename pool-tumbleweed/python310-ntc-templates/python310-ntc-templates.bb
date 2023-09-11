SUMMARY = "Package to return structured data from the output of network devices"
DESCRIPTION = "TextFSM is a project built by Google that takes CLI string output and passes each line through a series of regular expressions until it finds a match. The regular expressions use named capture groups to build a text table out of the significant text. The names of the capture groups are used as column headers, and the captured values are stored as rows in the table."
LICENSE = "Apache-2.0"

PV = "3.5.0"

RPM_NAME = "python310-ntc-templates-3.5.0-1.1.noarch.rpm"
RPM_HASH = "c912f2fa23e686bacb7f52929b41c5a208d0222fd7225ec7dbcec6d62219d8556eb1b448b23444b22063aac3c26aab13c049b4e443ae24548de2939f2e3ce7f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ntc-templates \
python310-ntc-templates \
python3dist-ntc-templates"

RDEPENDS:${PN} += "python-abi \
python310-textfsm"

inherit rpm
