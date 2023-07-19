SUMMARY = "Binary files of texloganalyser"
DESCRIPTION = "Binary files of texloganalyser"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn13663"

RPM_NAME = "texlive-texloganalyser-bin-2023.20230311.svn13663-93.1.aarch64.rpm"
RPM_HASH = "60503ec43b37325851772d3edc0bad731de1fd15127c9443f4d5c530a1e02e8b33aa462f61323b8872a942e653f5afabc63550ee93ad6bb92c7e85e9ca25b402"

RPROVIDES:${PN} += "texlive-texloganalyser-bin"

RDEPENDS:${PN} += "texlive-texloganalyser"

inherit rpm
