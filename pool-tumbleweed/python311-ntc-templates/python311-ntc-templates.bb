SUMMARY = "Package to return structured data from the output of network devices"
DESCRIPTION = "TextFSM is a project built by Google that takes CLI string output and passes each line through a series of regular expressions until it finds a match. The regular expressions use named capture groups to build a text table out of the significant text. The names of the capture groups are used as column headers, and the captured values are stored as rows in the table."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "python311-ntc-templates-3.1.0-1.5.noarch.rpm"
RPM_HASH = "1686994e3b5053fee282eba292534a443bd8272dfb8b4cb6dce4affb192d25de2af60efe1b47a30482f2645342fcb2d2203b8468d5b020ded8e6055f5230fb7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ntc-templates \
python3.11dist-ntc-templates \
python311-ntc-templates \
python3dist-ntc-templates"

RDEPENDS:${PN} += "python-abi \
python311-textfsm"

inherit rpm
