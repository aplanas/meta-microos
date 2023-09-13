SUMMARY = "Continuous File Synchronisation"
DESCRIPTION = "Syncthing is an application that synchronises files across multiple \
devices. This means the creation, modification or deletion of files \
on one machine will automatically be replicated to other devices."
LICENSE = "MPL-2.0"

PV = "1.24.0"

RPM_NAME = "syncthing-1.24.0-1.1.aarch64.rpm"
RPM_HASH = "70b02efda5532eae95a5ade6e4503c6a68695a35b043a00533e027c723fe95789ef7070e5cbc3eab3f9200179cdc712f830d75f63bc7ad57401b5116e7fbd5d0"

RPROVIDES:${PN} += "syncthing"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
