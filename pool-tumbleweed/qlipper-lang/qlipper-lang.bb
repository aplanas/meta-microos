SUMMARY = "Translations for package qlipper"
DESCRIPTION = "Provides translations for the 'qlipper' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.2"

RPM_NAME = "qlipper-lang-5.1.2-1.13.noarch.rpm"
RPM_HASH = "cf883f37dcd562ed9e651577e35aac1bfd69af4343836402fd6f83fad351d960fec6afab700f82529cd15e07d8856625fa7b9aa3b7f2af5217fefc5f67061e86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qlipper-lang \
qlipper-lang-all"

RDEPENDS:${PN} += "qlipper"

inherit rpm
