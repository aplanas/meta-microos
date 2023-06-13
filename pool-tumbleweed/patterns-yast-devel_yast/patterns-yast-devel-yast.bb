SUMMARY = "YaST Development"
DESCRIPTION = "Tools and libraries for developing YaST modules, the setup and configuration tool for openSUSE."
LICENSE = "MIT"

PV = "20220411"

RPM_NAME = "patterns-yast-devel_yast-20220411-1.4.aarch64.rpm"
RPM_HASH = "3464e4d81d87f93e788fb2d3e78a078a92c6bd3a69e5e37ae1b1cfb9f8969583861f4578110718146d82118f1c56dbefab26f31a5151fb961ee1cde698b03cbf"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
pattern-visible() \
patterns-yast-devel_yast \
patterns-yast-devel_yast(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
