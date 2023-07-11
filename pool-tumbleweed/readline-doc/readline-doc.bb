SUMMARY = "Documentation how to Use and Program with the Readline Library"
DESCRIPTION = "This package contains the documentation for using the readline library \
as well as programming with the interface of the readline library."
LICENSE = "GPL-3.0-or-later"

PV = "8.2"

RPM_NAME = "readline-doc-8.2-2.4.noarch.rpm"
RPM_HASH = "14bd3124edee0e026e79876cc0e00c15dfe896d4ee0fc9d83445c7a3f922ca3f127e6e1ff22e29020796127019219f846b51c03470a00d8e1aad8a053e30677f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "readline-/usr/share/info/readline.info.gz \
readline-doc"

RDEPENDS:${PN} += ""

inherit rpm
