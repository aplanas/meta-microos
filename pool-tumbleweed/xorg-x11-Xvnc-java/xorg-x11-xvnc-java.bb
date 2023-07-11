SUMMARY = "VNC viewer in java"
DESCRIPTION = "A VNC client written in java that can be used as standalone application or as \
an applet inside web page."
LICENSE = "GPL-2.0-only & MIT"

PV = "1.13.1"

RPM_NAME = "xorg-x11-Xvnc-java-1.13.1-3.3.noarch.rpm"
RPM_HASH = "c91541c985bd910db6f45733258ce61b4041f8a79763890e12efd163770c478079c85d8a3985a19579d7bdb76bb4876c9ea0a7798d686d6839be34475ac117c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xorg-x11-Xvnc-java"

RDEPENDS:${PN} += "systemd"

inherit rpm
