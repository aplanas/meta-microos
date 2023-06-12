SUMMARY = "On-screen Keyboard for GNOME -- Common data files"
DESCRIPTION = "Caribou is a text entry and UI navigation application being developed \
as an alternative to the Gnome On-screen Keyboard. The overarching goal \
for Caribou is to create a usable solution for people whose primary way \
of accessing a computer is a switch device."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.21"

RPM_NAME = "caribou-common-0.4.21-8.7.aarch64.rpm"
RPM_HASH = "7fcc687cff24dc798806ee0acdd62ae0899af08b67973027d40a84b66d35a10aeada710cd6ca1f462c9d08f484802e2ddb57b86f6b11043b2f9a595793afb5fc"

RPROVIDES:${PN} += "caribou-common \
caribou-common(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
