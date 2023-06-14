SUMMARY = "Match Globbing Patterns Against Text"
DESCRIPTION = "Text::Glob implements glob(3) style matching that can be used to match \
against text, rather than fetching names from a filesystem. If you want to \
do full file globbing use the File::Glob module instead."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.11"

RPM_NAME = "perl-Text-Glob-0.11-1.23.noarch.rpm"
RPM_HASH = "c632edfd8dcb0e572adf90e401c7c358ea5df7a208b045db2229effa45cefaa57dd2c37eabc1bc7fe05f4a46f4e7f0fe2456da15562bae7809e925d8cf1b8cf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--Glob \
perl-Text-Glob"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
