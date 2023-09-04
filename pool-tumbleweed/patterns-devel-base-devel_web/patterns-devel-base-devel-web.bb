SUMMARY = "Web Development"
DESCRIPTION = "Tools and libraries for Web application development."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-devel-base-devel_web-20170319-12.1.aarch64.rpm"
RPM_HASH = "4b3f3728a59b5c2a2eeba986592ac871901f5d828ce39c93b980592a52d1e31091ce8a7c17a36ae3bd824ee805c20537b462326ecb1c20fdb763f3afa44c36fc"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-devel-base-devel-web"

RDEPENDS:${PN} += "pattern-"

inherit rpm
