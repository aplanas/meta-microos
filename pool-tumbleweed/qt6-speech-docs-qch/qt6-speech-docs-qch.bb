SUMMARY = "Documentation for qt6-speech in QCH format"
DESCRIPTION = "This package contains documentation for qt6-speech in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-speech-docs-qch-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "ce01a01b5aee9140612d9c959c502d315049ac5ea1eb665c959c85d0964317418d272c193e827e40a88eb22ed910d4132427440dc247b0c119f91ceb1f450cbc"

RPROVIDES:${PN} += "qt6-speech-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
