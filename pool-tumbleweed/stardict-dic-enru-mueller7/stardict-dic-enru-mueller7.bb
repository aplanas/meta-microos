SUMMARY = "English-Russian dictionary by professor V. K. Mueller"
DESCRIPTION = "English-Russian dictionary by professor V. K. Mueller, 7 edition with 46231 articles in StarDict format."
LICENSE = "GPL-2.0+"

PV = "1.2"

RPM_NAME = "stardict-dic-enru-mueller7-1.2-19.16.noarch.rpm"
RPM_HASH = "4ed41be8b8a0b30221d6919068c45b7b60c5178dfb08e0432c71b2b44e3d642a3bf4e45c932bb9e2b232d53a70e1663ff642706c89deddeed4295b22e304faf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-stardict-ru \
stardict-dic-enru-mueller7"

RDEPENDS:${PN} += ""

inherit rpm
