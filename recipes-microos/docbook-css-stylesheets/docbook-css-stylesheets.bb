SUMMARY = "DocBook CSS Stylesheets"
DESCRIPTION = "These cascading stylesheets allow you to view a DocBook XML document in \
software that supports XML styled with CSS2, for example, a recent \
Mozilla or Firefox browser. For more complex modifications of your XML \
document use the DocBook XSL stylesheets."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "docbook-css-stylesheets-0.4-161.16.noarch.rpm"
RPM_HASH = "6dd39c49cab4495dfc0c3b19e4601a22408755f234515756ad70aee8d428dd0108b72f13da712ebced3f4c2387b082ca12e3cdb2194eaad37112898a84003c2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docbook-css-stylesheets"
RDEPENDS:${PN} += ""

inherit rpm
