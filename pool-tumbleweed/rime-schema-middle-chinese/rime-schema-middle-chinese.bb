SUMMARY = "middle-chinese input schema for rime"
DESCRIPTION = "middle-chinese input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-middle-chinese-20230603+git.5fdd2d6-1.2.noarch.rpm"
RPM_HASH = "5967469f30e04d3e476f815a0295f4540eb1d18295d15a684b5c10db96f9565ccff2b41fa7c1cc8a51ca54b7cb2643b4beb2bab75e90b108ada873a5da020b61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-middle-chinese"

RDEPENDS:${PN} += ""

inherit rpm
