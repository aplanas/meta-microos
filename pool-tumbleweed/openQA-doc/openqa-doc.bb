SUMMARY = "The openQA documentation"
DESCRIPTION = "Documentation material covering installation, configuration, basic test writing, etc. \
Covering both openQA and also os-autoinst test engine."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1690803816.e47aebd"

RPM_NAME = "openQA-doc-4.6.1690803816.e47aebd-1.1.aarch64.rpm"
RPM_HASH = "9c8d209370e83644df7cb179fb2d2d6435dc4dd95e283a030c247ee345098968699f350393f4fd850089529bca59749aca78ae799f2b310d0b7e61bd3535c872"

RPROVIDES:${PN} += "openQA-doc"

RDEPENDS:${PN} += ""

inherit rpm
