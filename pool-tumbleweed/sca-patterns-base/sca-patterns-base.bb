SUMMARY = "Supportconfig Analysis Pattern Base Libraries"
DESCRIPTION = "Supportconfig Analysis (SCA) appliance pattern base libraries used \
by all patterns"
LICENSE = "GPL-2.0-only"

PV = "1.5.1"

RPM_NAME = "sca-patterns-base-1.5.1-1.2.noarch.rpm"
RPM_HASH = "c8c63a79b38b39274d42515c25c148550073af324474effe6c90301ccbbf035a50408e2fe466e78cdbe4030fb14787dbc6e3b22ec8f242d437c011d1ade15226"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(SDP::Core) \
perl(SDP::SUSE) \
sca-patterns-base"
RDEPENDS:${PN} += "bash \
perl \
python3-base"

inherit rpm
