SUMMARY = "Time zone rules compiler Java"
DESCRIPTION = "This is a time zone rules compiler for opensource Java Virtual Machine \
derived from openjdk8 source code."
LICENSE = "GPL-2.0-with-classpath-exception"

PV = "1.8"

RPM_NAME = "tzdb-1.8-3.19.noarch.rpm"
RPM_HASH = "8716c08f12cc6987c26f03c4f215de68313f5864a2419da41bc18052886a1970269e1a9afa65d6631457d74d948da93203cf7066eb75d92a6a72d66467836af6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tzdb"

RDEPENDS:${PN} += ""

inherit rpm
