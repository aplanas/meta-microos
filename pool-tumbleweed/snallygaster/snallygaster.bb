SUMMARY = "Tool to scan for hidden files on HTTP servers"
DESCRIPTION = "A tool that looks for files accessible on web servers that shouldn't be public \
and can pose a security risk. \
 \
Typical examples include publicly accessible git repositories, backup files \
potentially containing passwords or database dumps. In addition, it contains \
a few checks for other security vulnerabilities."
LICENSE = "CC0-1.0"

PV = "0.0.12"

RPM_NAME = "snallygaster-0.0.12-1.7.noarch.rpm"
RPM_HASH = "5d617e541af859badfcc98578623b1b7e874a76df65de9bfaaf5e72734d8f0c252dd8eb7dbab2a6a16962da6468a5541c0807287f88fdf585410bb0f5c38a460"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-snallygaster \
python3dist-snallygaster \
snallygaster"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-beautifulsoup4 \
python3-dnspython \
python3-urllib3"

inherit rpm
