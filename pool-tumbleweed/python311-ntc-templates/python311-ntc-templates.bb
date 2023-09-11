SUMMARY = "Package to return structured data from the output of network devices"
DESCRIPTION = "TextFSM is a project built by Google that takes CLI string output and passes each line through a series of regular expressions until it finds a match. The regular expressions use named capture groups to build a text table out of the significant text. The names of the capture groups are used as column headers, and the captured values are stored as rows in the table."
LICENSE = "Apache-2.0"

PV = "3.5.0"

RPM_NAME = "python311-ntc-templates-3.5.0-1.1.noarch.rpm"
RPM_HASH = "c206783fb50b545772c77c0d1fc4f7bdb1770bd3330afedfd4aac35053382ce6ed98dc3e1ab8f763c4db9b02f3468e504fe3cf19723fa73dab83ea4018cce5b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ntc-templates \
python3.11dist-ntc-templates \
python311-ntc-templates \
python3dist-ntc-templates"

RDEPENDS:${PN} += "python-abi \
python311-textfsm"

inherit rpm
