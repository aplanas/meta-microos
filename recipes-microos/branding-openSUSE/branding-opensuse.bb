SUMMARY = "openSUSE Tumbleweed Brand File"
DESCRIPTION = "This package contains the file /etc/SUSE-brand, and its name is used as \
a trigger for installation of correct vendor brand packages."
LICENSE = "BSD-3-Clause & CC-BY-SA-3.0 & GPL-2.0-or-later"

PV = "84.87.20230227"

RPM_NAME = "branding-openSUSE-84.87.20230227-1.1.noarch.rpm"
RPM_HASH = "c49fd8676def2cbb6e790afcbbcbd81688dd83a9b6c994dc4720aeb33135bb38fad8c7378afbb30a0fddd192998995dd54085caeb0687ec87b75834a70bcd1ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "branding branding-openSUSE"
RDEPENDS:${PN} += ""

inherit rpm
