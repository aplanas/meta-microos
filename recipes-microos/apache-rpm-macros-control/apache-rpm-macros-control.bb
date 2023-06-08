SUMMARY = "Apache RPM Macros"
DESCRIPTION = "Macros intended for Apache restarts in rpm scriptlets."
LICENSE = "Apache-2.0"

PV = "20151110"

RPM_NAME = "apache-rpm-macros-control-20151110-3.10.aarch64.rpm"
RPM_HASH = "a0f7d932533b2195272317e2e1af1e49503e56fb61ad38cbdd4a6fc0eb0dfef86a0dfe89256c505cd16bf12deb420cbbcd42ef948e904747147ba33281cd8573"

RPROVIDES:${PN} += "apache-rpm-macros-control apache-rpm-macros-control(aarch-64) rpm_macro(apache_request_restart) rpm_macro(apache_restart_flag) rpm_macro(apache_restart_if_needed)"
RDEPENDS:${PN} += ""

inherit rpm
