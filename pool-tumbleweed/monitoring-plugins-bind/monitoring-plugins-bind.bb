SUMMARY = "Check whether BIND is running and to get the performance data via rndc stats"
DESCRIPTION = "check_bind.sh is a Nagios plugin to check the bind daemon whether it's running \
via its pid file and then gets the statistics via rndc stats. The user that run \
the script needs the ability to 'sudo rndc stats'! The timeframe in which the \
rndc stats output is updated is controlled by the check interval. The output \
shows amount of requests of various types occured during the last check \
interval. The script itself is written sh-compliant and free software under the \
terms of the GPLv2 (or later)."
LICENSE = "GPL-2.0-or-later"

PV = "1.3"

RPM_NAME = "monitoring-plugins-bind-1.3-104.6.noarch.rpm"
RPM_HASH = "82fc098a733e07b49166cc3b059b4d5a72c0d67f48e9be81f41eb6930108963ec5dc55f5159ace60ddcbcacb9dddf44ec59402f2b255a672a58478dcadf2f3f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "monitoring-plugins-bind \
nagios-plugins-bind"

RDEPENDS:${PN} += "/bin/sh \
bind-utils \
coreutils \
gawk \
sudo"

inherit rpm
