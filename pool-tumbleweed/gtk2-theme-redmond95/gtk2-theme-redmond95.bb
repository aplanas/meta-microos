SUMMARY = "Redmond Theme for GTK+ 2"
DESCRIPTION = "The Redmond engine and theme are designed to mimic the appearance of \
another well known OS."
LICENSE = "LGPL-2.1+"

PV = "2.20.2"

RPM_NAME = "gtk2-theme-redmond95-2.20.2-19.43.noarch.rpm"
RPM_HASH = "9b5d521625f66a8e4352bf795d8da2d11df86253a49f8a20847f3fb7d3f7cb5a5bd54e42d82993d9db8922c5da0af90250d8a352c986bd6793e96ea040baeed5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-theme-redmond95"

RDEPENDS:${PN} += "gtk2-engine-redmond95"

inherit rpm
