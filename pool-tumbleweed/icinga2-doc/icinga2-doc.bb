SUMMARY = "Documentation for Icinga 2"
DESCRIPTION = "This subpackage provides documentation for Icinga 2."
LICENSE = "GPL-2.0-or-later"

PV = "2.13.8"

RPM_NAME = "icinga2-doc-2.13.8-1.1.aarch64.rpm"
RPM_HASH = "e40798e0916c26164b56b1aa0c4ce7d513f0d630cffaaf8e68ca1639db768e772a17f16004d63ee1ddf9b50da2a2427066d013dfea29b0bb425fea628d83ae80"

RPROVIDES:${PN} += "icinga2-doc"

RDEPENDS:${PN} += ""

inherit rpm
