SUMMARY = "Extension for accessing Google data"
DESCRIPTION = "An extension for accessing some Google services, such as Google Calendar, \
Google Contacts and Google tasks."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libkgapi-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "f5c4227eb387a0bdb5d7d6fe3b6e7341b1ec882919a334c09c692fa352eb5f3814b97308d3c039f787375eefb4afe8bd66ac080142e59c8f4e63e76e9791d55a"

RPROVIDES:${PN} += "libkgapi"

RDEPENDS:${PN} += ""

inherit rpm
