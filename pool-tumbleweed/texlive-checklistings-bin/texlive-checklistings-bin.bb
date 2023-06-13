SUMMARY = "Binary files of checklistings"
DESCRIPTION = "Binary files of checklistings"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn38300"

RPM_NAME = "texlive-checklistings-bin-2023.20230311.svn38300-91.1.aarch64.rpm"
RPM_HASH = "93cb076062d4a5558d514be801ec948edc755cd25127acd2e54078e2f829636d15c1ad8e5696c08291e4d135511b4db6c6a433df9e6f39c6bb42e1a236e706d2"

RPROVIDES:${PN} += "texlive-checklistings-bin \
texlive-checklistings-bin(aarch-64)"

RDEPENDS:${PN} += "texlive-checklistings"

inherit rpm
