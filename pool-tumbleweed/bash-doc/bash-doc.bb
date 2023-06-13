SUMMARY = "Documentation how to Use the GNU Bourne-Again Shell"
DESCRIPTION = "This package contains the documentation for using the bourne shell \
interpreter Bash."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.15"

RPM_NAME = "bash-doc-5.2.15-8.3.noarch.rpm"
RPM_HASH = "a198101aab5a67887057ab90aba531b2117350e0daf57e3bacd4e1cebbc94f210d23d8093a45d6bf53f379cb183a08abe9ad9eac0e04a3d5f6678daa918aaeaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bash-doc \
bash:/usr/share/info/bash.info.gz"

RDEPENDS:${PN} += ""

inherit rpm
