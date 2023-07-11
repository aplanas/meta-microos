SUMMARY = "User/System Xsession Desktop File"
DESCRIPTION = "This package contains the System desktop file which will cause \
the execution of a user provided $HOME/.xsession script or pick \
the system wide DM default set in /etc/sysconfig/displaymanager."
LICENSE = "MIT"

PV = "1.1.14"

RPM_NAME = "xdm-xsession-1.1.14-4.2.aarch64.rpm"
RPM_HASH = "512ebe8d5c0ec61a8e284ce4bce57855a15b4a849d7d85de760c6b9131ecbc1ea5af04ec9ab8fa576127eee2f9aa3366dc813e5ee572994f4da44404ec05e368"

RPROVIDES:${PN} += "xdm-xsession"

RDEPENDS:${PN} += "xdm"

inherit rpm
