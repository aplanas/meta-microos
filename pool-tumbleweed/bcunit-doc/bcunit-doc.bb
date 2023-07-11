SUMMARY = "BCUnit documentation"
DESCRIPTION = "BCUnit is a unit testing framework for C. \
This package installs the BCUnit documentation files."
LICENSE = "LGPL-2.0-or-later"

PV = "3.0.2+git.20191119"

RPM_NAME = "bcunit-doc-3.0.2+git.20191119-1.14.aarch64.rpm"
RPM_HASH = "0c79fc56b4d4a44628143a5ca86ac9d0bd578bbe50d181eb1d1ae35a9d061ada8fc557662e5c1539bcd0d1394fe0804647eb28179f16b6360ae96a4d5ea9f290"

RPROVIDES:${PN} += "bcunit-doc"

RDEPENDS:${PN} += "libbcunit1"

inherit rpm
