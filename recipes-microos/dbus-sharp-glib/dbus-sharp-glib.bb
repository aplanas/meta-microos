SUMMARY = "Glib integration for DBus"
DESCRIPTION = "This package provides glib integration for Mono.DBus."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "dbus-sharp-glib-0.5.0-15.8.noarch.rpm"
RPM_HASH = "ac19935c071586857a9723bc5ead2b24d23a81aa63009a5164875b7369fb7600849a80efe7f25c3bebb10dadb2bd4cc703e97688d0d730a1e2b3377cfbd9c971"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dbus-sharp-glib mono(dbus-sharp-glib)"
RDEPENDS:${PN} += "dbus-sharp mono(dbus-sharp) mono(mscorlib)"

inherit rpm
