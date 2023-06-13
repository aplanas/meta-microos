SUMMARY = "Check the status of a NIS server on a specified host and NIS domain"
DESCRIPTION = "Check the status of a NIS server on a specified host and NIS domain by asking \
NIS server for 'passwd.byname'. \
 \
As an additional check, a username may be specified which will then be \
'looked up' on the NIS server, note that this is optional and only \
introduced in v1.1 \
 \
Script returns OK if it gets an acceptable answer, CRITICAL if not. \
 \
This *nix script has been designed and written for the lowest common \
denominator of shells (sh), uses yppoll, ypcat and grep as external \
commands."
LICENSE = "GPL-3.0+"

PV = "1.2"

RPM_NAME = "monitoring-plugins-nis-1.2-1.16.noarch.rpm"
RPM_HASH = "20387e7e5101161eff933db2e364db338c794bd7851084087e118235b842033fc61454062e8ddb04d90389c44a524afb1e64b1849c869b45ba9efdc289b442ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "monitoring-plugins-nis \
nagios-plugins-nis"

RDEPENDS:${PN} += "/bin/sh \
yp-tools"

inherit rpm
