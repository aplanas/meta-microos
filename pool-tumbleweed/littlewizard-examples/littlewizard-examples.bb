SUMMARY = "Example files for Little Wizard"
DESCRIPTION = "Little Wizard is created especially for primary school children. It allows to \
learn using main elements of present computer languages, including: variables, \
expressions, loops, conditions, logical blocks. Every element of language is \
represented by an intuitive icon. It allows program Little Wizard without \
using keyboard, only mouse. \
 \
This package contains example files for Little Wizard."
LICENSE = "SUSE-Public-Domain"

PV = "20071206"

RPM_NAME = "littlewizard-examples-20071206-15.16.noarch.rpm"
RPM_HASH = "9e4521ca78468dedb93e9dd24e462677fc71e53888bc5dfac425ffbb6bc2015c48769aa7a4b92218559818d275758506effe09f1f19dab5e014b632f37e5e58f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "littlewizard-examples"

RDEPENDS:${PN} += "littlewizard"

inherit rpm
