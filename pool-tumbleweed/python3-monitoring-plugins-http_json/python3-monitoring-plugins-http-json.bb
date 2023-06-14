SUMMARY = "Plugin for Nagios which checks json values from a given HTTP endpoint"
DESCRIPTION = "A generic plugin for Icinga/Nagios which checks json values from a given \
HTTP endpoint against argument specified rules and determines the \
status and performance data for that service."
LICENSE = "Apache-2.0"

PV = "2.1.2"

RPM_NAME = "python3-monitoring-plugins-http_json-2.1.2-2.1.noarch.rpm"
RPM_HASH = "af1737cfc8d049d0142b0b3cd9c0aaf8a02dfa9e0eff5ffa03cb1accf20a3d151019bad4959030bb101b7db44de9ebc6d0c1c095785ba1ed61199dd1e1ff0f26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-monitoring-plugins-http-json"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
