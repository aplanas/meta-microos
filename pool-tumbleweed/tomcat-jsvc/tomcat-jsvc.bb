SUMMARY = "Apache jsvc wrapper for Apache Tomcat as separate service"
DESCRIPTION = "Systemd service and wrapper scripts to start tomcat with jsvc, \
which allows tomcat to perform some privileged operations \
(e.g. bind to a port < 1024) and then switch identity to a non-privileged user."
LICENSE = "Apache-2.0"

PV = "9.0.75"

RPM_NAME = "tomcat-jsvc-9.0.75-1.2.noarch.rpm"
RPM_HASH = "3b354c3773a53daffa78b024ded4011e59ff36fc2e2a8be123dbacbb82b2d51eaeea579c5c02d9b6c84861856e22b10384f9fb4c111342d267fa0321d17059fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tomcat-jsvc"

RDEPENDS:${PN} += "/usr/bin/sh \
apache-commons-daemon-jsvc \
tomcat"

inherit rpm
