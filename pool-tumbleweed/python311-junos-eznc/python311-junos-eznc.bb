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

RPM_NAME = "python311-junos-eznc-2.6.7-1.2.noarch.rpm"
RPM_HASH = "161a590568d942023ad51b691c0a290cc83d35070643e8a6ed7b86ed3f174a98b26632546688ae53d914be12c9de74beed3367c2c24be42dc03ee8919bf2e726"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(junos-eznc) \
python311-junos-eznc \
python3dist(junos-eznc)"

RDEPENDS:${PN} += "python(abi) \
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
