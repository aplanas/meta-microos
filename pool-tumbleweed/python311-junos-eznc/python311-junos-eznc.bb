SUMMARY = "Junos 'EZ' automation for non-programmers"
DESCRIPTION = "Junos PyEZ is designed to provide the same capabilities as a user would have \
on the Junos CLI, but in an environment built for automation tasks. \
These capabilities include, but are not limited to: \
 \
 - Remote connectivity and management of Junos devices via NETCONF \
 - Provide 'facts' about the device \
 - Retrieve 'operational' or 'run-state' information \
 - Retrieve configuration information \
 - Make configuration changes in unstructured and structured ways \
 - Provide common utilities for tasks such as secure copy of files and \
   software updates"
LICENSE = "Apache-2.0"

PV = "2.6.7"

RPM_NAME = "python311-junos-eznc-2.6.7-1.4.noarch.rpm"
RPM_HASH = "56c919844fc3ffd4455433c9b8ffffcfebd40254f77f24ec24d84f4013d05bc523bbf0d600e0f2051ef375d75d39d4a3ad0be5d986b8de491950d7b769d10359"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-junos-eznc \
python3.11dist-junos-eznc \
python311-junos-eznc \
python3dist-junos-eznc"

RDEPENDS:${PN} += "python-abi \
python311-Jinja2 \
python311-PyYAML \
python311-lxml \
python311-ncclient \
python311-netaddr \
python311-ntc-templates \
python311-paramiko \
python311-pyparsing \
python311-pyserial \
python311-scp \
python311-six \
python311-transitions"

inherit rpm
