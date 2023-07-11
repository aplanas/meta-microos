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

RPM_NAME = "python310-junos-eznc-2.6.7-1.4.noarch.rpm"
RPM_HASH = "370d71f3a82934bbad74e075f1f92310b45effc4f45e171cde828d1c51b7fc06746dbebb5b4fbf60f4089e3a374cb520c6a892799b63cbaeb8c83a45c0f5d18c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-junos-eznc \
python310-junos-eznc \
python3dist-junos-eznc"

RDEPENDS:${PN} += "python-abi \
python310-Jinja2 \
python310-PyYAML \
python310-lxml \
python310-ncclient \
python310-netaddr \
python310-ntc-templates \
python310-paramiko \
python310-pyparsing \
python310-pyserial \
python310-scp \
python310-six \
python310-transitions"

inherit rpm
