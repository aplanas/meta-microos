SUMMARY = "Grafana Status panel"
DESCRIPTION = "This is a plugin meant to be used as a centralized view for the status of \
component in a glance. It is very similar to the Single Stat panel, but it \
can hold multiple values from the same data source. Each value can be used \
to customize the panel in different ways: \
 \
Mark the severity of the component \
Mark if the component is disabled \
Show extra data in the panel about the component"
LICENSE = "Apache-2.0"

PV = "1.0.10"

RPM_NAME = "grafana-status-panel-1.0.10-1.7.noarch.rpm"
RPM_HASH = "2c204e0398cd5e27ea4c760bffc7b8ac5674e3ce14a72830c0e97bcf51fae7ea16466186033c43662aa7fffd7c57642aa15021385e0c48cd9e176d8320304662"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grafana-status-panel"
RDEPENDS:${PN} += "grafana"

inherit rpm
