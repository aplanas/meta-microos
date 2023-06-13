SUMMARY = "Redmond Theme for GTK+ 2"
DESCRIPTION = "The Redmond engine and theme are designed to mimic the appearance of \
another well known OS."
LICENSE = "LGPL-2.1+"

PV = "2.20.2"

RPM_NAME = "gtk2-theme-redmond95-2.20.2-19.42.noarch.rpm"
RPM_HASH = "b1a6c424592f73d0684219d5951a700ed57de4581e42f048a81a78d56a4755be8402e46a0935383c17e50038597b43df3b16a6dc98b9caaeb2ebf8493e98cc17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-theme-redmond95"

RDEPENDS:${PN} += "gtk2-engine-redmond95"

inherit rpm
