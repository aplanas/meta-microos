SUMMARY = "Busybox applets providing syslogd"
DESCRIPTION = "This package contains the symlinks to provide syslogd with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-syslogd-1.36.0-26.3.noarch.rpm"
RPM_HASH = "87e0e3f4843b17aa896fc289d4ab678a099d718f465b3718d2afea705dd3ec1821ec6c76f97904708b02eba18d90253c48f673bc905ed053c6e3f7a219005c89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-syslogd"

RDEPENDS:${PN} += "busybox"

inherit rpm
