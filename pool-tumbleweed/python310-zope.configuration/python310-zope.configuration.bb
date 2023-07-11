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

RPM_NAME = "python310-zope.configuration-4.4.1-2.2.noarch.rpm"
RPM_HASH = "36dc269345d470e1a2b3346baab73a1a2b26e9de94019d42b1e6c2118bcba577545058a8867174b9e39baea54c6e1a51ac9485a13882e98b911be57de065fd15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-zope.configuration \
python310-zope.configuration \
python3dist-zope.configuration"

RDEPENDS:${PN} += "python-abi \
python310-zope.i18nmessageid \
python310-zope.interface \
python310-zope.schema"

inherit rpm
