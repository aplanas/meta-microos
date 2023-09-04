SUMMARY = "Module for when strings are too long to be displayed in.."
DESCRIPTION = "a module for when strings are too long to be displayed in..."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.100603"

RPM_NAME = "perl-String-Truncate-1.100603-1.4.noarch.rpm"
RPM_HASH = "cf518bd025c8e479a15390be957322ac8e37854e9de9c63a3356e893ba8cec5f24cfdbf08fd2dab797b836bdabf7dcc0af9c7b109f35819cc0f4702530eb4175"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-String--Truncate \
perl-String-Truncate"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Sub--Exporter \
perl-Sub--Exporter--Util \
perl-Sub--Install"

inherit rpm
