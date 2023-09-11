SUMMARY = "Package to return structured data from the output of network devices"
DESCRIPTION = "TextFSM is a project built by Google that takes CLI string output and passes each line through a series of regular expressions until it finds a match. The regular expressions use named capture groups to build a text table out of the significant text. The names of the capture groups are used as column headers, and the captured values are stored as rows in the table."
LICENSE = "Apache-2.0"

PV = "3.5.0"

RPM_NAME = "python39-ntc-templates-3.5.0-1.1.noarch.rpm"
RPM_HASH = "930070f3e1a4b6fe4444be20626caf5cfd42260bfe0d21d23f9217dcc4b32ef41bb49fe03e5d959aba62eae0048520189ff5246ddb83122cde21776fc9badd7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ntc-templates \
python39-ntc-templates \
python3dist-ntc-templates"

RDEPENDS:${PN} += "python-abi \
python39-textfsm"

inherit rpm
