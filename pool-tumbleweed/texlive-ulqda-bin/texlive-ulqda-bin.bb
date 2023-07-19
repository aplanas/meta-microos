SUMMARY = "Binary files of ulqda"
DESCRIPTION = "Binary files of ulqda"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn13663"

RPM_NAME = "texlive-ulqda-bin-2023.20230311.svn13663-93.1.aarch64.rpm"
RPM_HASH = "cd0bc3950c44bc52b5697ad2bae467ef6f292bb8f4acf5cc2235ecae95d60c33b2b1704a7b318737ea1bdc7931e7fd1d41191770c81b44198253b9f40d8a629c"

RPROVIDES:${PN} += "texlive-ulqda-bin"

RDEPENDS:${PN} += "texlive-ulqda"

inherit rpm
