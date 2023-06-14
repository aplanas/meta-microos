SUMMARY = "User/System Xsession Desktop File"
DESCRIPTION = "This package contains the System desktop file which will cause \
the execution of a user provided $HOME/.xsession script or pick \
the system wide DM default set in /etc/sysconfig/displaymanager."
LICENSE = "MIT"

PV = "1.1.14"

RPM_NAME = "xdm-xsession-1.1.14-4.1.aarch64.rpm"
RPM_HASH = "2650bfa340cb2cc88ba3f21ce358c2ce0eb09fab5379020a746f1420b1a462665423a308ca974f43fb21541f4172f62bb3ff936faf65d0380e7a9409532e7dd4"

RPROVIDES:${PN} += "xdm-xsession"

RDEPENDS:${PN} += "xdm"

inherit rpm
