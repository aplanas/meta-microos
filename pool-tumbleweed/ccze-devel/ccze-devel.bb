SUMMARY = "Development files for ccze"
DESCRIPTION = "This package contains libraries and header files for developing \
applications that use ccze."
LICENSE = "GPL-2.0+"

PV = "0.2.1.2"

RPM_NAME = "ccze-devel-0.2.1.2-2.23.aarch64.rpm"
RPM_HASH = "79acf368beb8236570076a1ff66e20056f48862220fb2d1fd41c5483f93f38ba3561aba570a7617bed081d5803ac9dac3f0f7845e91ed35de15aab2ff5a14a11"

RPROVIDES:${PN} += "ccze-devel"

RDEPENDS:${PN} += "ccze"

inherit rpm
