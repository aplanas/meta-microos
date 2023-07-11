SUMMARY = "Continuous File Synchronisation"
DESCRIPTION = "Syncthing is an application that synchronises files across multiple \
devices. This means the creation, modification or deletion of files \
on one machine will automatically be replicated to other devices."
LICENSE = "MPL-2.0"

PV = "1.23.6"

RPM_NAME = "syncthing-1.23.6-1.1.aarch64.rpm"
RPM_HASH = "3777eb50bc8769923804d7b783740fcd15bbdca2553c621651ae72b7ad32485becb8321cf191bb11b8668f0df7281a0e06a963476eb06a48467593ba2b1d238d"

RPROVIDES:${PN} += "syncthing"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
