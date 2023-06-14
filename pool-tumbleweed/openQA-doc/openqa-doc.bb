SUMMARY = "The openQA documentation"
DESCRIPTION = "Documentation material covering installation, configuration, basic test writing, etc. \
Covering both openQA and also os-autoinst test engine."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1685738164.28716cd"

RPM_NAME = "openQA-doc-4.6.1685738164.28716cd-1.1.aarch64.rpm"
RPM_HASH = "f2c887eec9d1be86e1528e752bb0a0f6d38b7c521f583a8591d1356d15fca9648346c31387017f3f6c12fed10cbe46158559223881f44f4d5d43d8b0c734dde6"

RPROVIDES:${PN} += "openQA-doc"

RDEPENDS:${PN} += ""

inherit rpm
