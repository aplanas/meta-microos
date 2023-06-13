SUMMARY = "Daemon to execute actions on ACPI events"
DESCRIPTION = "ACPID is a flexible, extensible daemon for delivering ACPI events. It \
listens to a file (/proc/acpi/event) and, when an event occurs, \
executes programs to handle the event. The start script loads all \
needed modules."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.34"

RPM_NAME = "acpid-2.0.34-2.1.aarch64.rpm"
RPM_HASH = "e7a7eac8e0fd2bf9cc8eb3a7e0aa51fc13e1c547bacf6ecc9c658f22153ea0c7f9bc8c57b627a523ad987bc7adb32a7eb81911eab416815c81a84cb42e3c43ff"

RPROVIDES:${PN} += "acpid \
acpid(aarch-64) \
config(acpid)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
