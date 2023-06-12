SUMMARY = "Cross distribution and cross architecture autoyast XML syntax checker"
DESCRIPTION = "Developing autoyast XML files for autoinstallation, this checker comes in \
really handy. It can compatibility check XML files and validate against \
all recent released SUSE distributions. \
Avoid time consuming fiddling and trial on error approaches. \
When you already have valid autoyast configuration files and you want to \
install more recent distributions, use this tool to verify that your XML \
syntax is still backward compatible. \
se this validator to make your XML autoyast files more robust and stable \
before even starting an auto-installation."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.9+gite8164d1"

RPM_NAME = "autoyast_xml_validator-1.0.9+gite8164d1-1.6.noarch.rpm"
RPM_HASH = "96ae83ebdb1ad4417fe328f8a4086f3c340ce201ce6ae45dfbc41c4a5dfabe708b6845ead3957b7c0c303ef1fd2cbff3095ddbb5ebaf61bb50a6190e4b4a4179"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "autoyast_xml_validator"
RDEPENDS:${PN} += "/usr/bin/python3 \
jing \
libxml2-tools \
yast2-schema-collection"

inherit rpm
