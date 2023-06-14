SUMMARY = "Zope Configuration Markup Language (ZCML)"
DESCRIPTION = "The zope configuration system provides an extensible system for supporting \
various kinds of configurations. \
 \
It is based on the idea of configuration directives. Users of the configuration \
system provide configuration directives in some language that express \
configuration choices. The intent is that the language be pluggable. An XML \
language is provided by default."
LICENSE = "ZPL-2.1"

PV = "4.4.1"

RPM_NAME = "python310-zope.configuration-4.4.1-2.1.noarch.rpm"
RPM_HASH = "ee7ba1a96ed52c342b8bedf1072d79bcfcee159e45a358de171df6b8e645876ba226da8e0ecfc3065217373395156ee28f8af1b10d981fc42682a6dea82b5b2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zope.configuration \
python3.10dist-zope.configuration \
python310-zope.configuration \
python3dist-zope.configuration"

RDEPENDS:${PN} += "python-abi \
python310-zope.i18nmessageid \
python310-zope.interface \
python310-zope.schema"

inherit rpm
