SUMMARY = "Convenience package for a single-instance setup using nginx proxy"
DESCRIPTION = "Use this package to setup a local instance with all services provided together."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1689265095.7be7504"

RPM_NAME = "openQA-single-instance-nginx-4.6.1689265095.7be7504-1.1.aarch64.rpm"
RPM_HASH = "95930550a09db439eb918316152d4662e14ea4fb34c0133dfcaf3e994e3dd9005263641688c95556b975b41a1f91c79cc93275d5ea4156b338391bc020b89962"

RPROVIDES:${PN} += "openQA-single-instance-nginx"

RDEPENDS:${PN} += "nginx \
openQA \
openQA-local-db \
openQA-worker"

inherit rpm
