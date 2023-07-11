SUMMARY = "YaST2 - Esperanto Translations"
DESCRIPTION = "YaST2 - Translations for Esperanto."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-eu-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "05f0f4afb666b5cbccc297051e9c29d158acb7e4c14b14d1894b490e81c7f3bc8330b8d885cb0a45220584f9bcc4cb19b39019c228adc2a62484eb0fa000da8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-eu \
yast2-trans-eu"

RDEPENDS:${PN} += ""

inherit rpm
