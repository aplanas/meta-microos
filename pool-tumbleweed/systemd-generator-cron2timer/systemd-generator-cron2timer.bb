SUMMARY = "Systemd generator to create timer units"
DESCRIPTION = "Systemd generator to create timer units from scripts in \
/etc/cron.{hourly,daily,weekly,monthly,yearly} \
 \
Using this method alleviates the need to install cron to run those \
scripts. The cron implementation uses a shell script that wakes up \
every hour, even when there's nothing to do. Timers on the other \
hand are created only for scripts that actually exist and trigger at \
the specific time the scripts must run."
LICENSE = "MIT"

PV = "0"

RPM_NAME = "systemd-generator-cron2timer-0-1.1.noarch.rpm"
RPM_HASH = "d02f0fbc12f816fb3d8247ddc4d82edda1c2b02abe026333293b49c3f30e120711977c08da74ba2c239186e800fce10b17520fd9282aa86b8e63173199912c33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemd-generator-cron2timer"

RDEPENDS:${PN} += "/bin/bash \
systemd"

inherit rpm
