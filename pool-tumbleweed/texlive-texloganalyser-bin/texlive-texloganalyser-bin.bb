SUMMARY = "Binary files of texloganalyser"
DESCRIPTION = "Binary files of texloganalyser"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn13663"

RPM_NAME = "texlive-texloganalyser-bin-2023.20230311.svn13663-93.2.aarch64.rpm"
RPM_HASH = "de2e6d1da7c80451ba2f859d31362fd776867b97cf7890f10b00cc7a49e25a92417352302cc6d7fe2f34deb479671bf1e07b062c021f886f6e48e90d424cd300"

RPROVIDES:${PN} += "texlive-texloganalyser-bin"

RDEPENDS:${PN} += "texlive-texloganalyser"

inherit rpm
