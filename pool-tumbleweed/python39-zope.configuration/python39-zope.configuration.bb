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

RPM_NAME = "python39-zope.configuration-4.4.1-2.2.noarch.rpm"
RPM_HASH = "a0d1eecf8531fbce160ebfff613043a1eda08482c12533843e9203bf3441417d39610ac9bd9b2a24e24814964727ca969a188499f07364f98ef0affd027974fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-zope.configuration \
python39-zope.configuration \
python3dist-zope.configuration"

RDEPENDS:${PN} += "python-abi \
python39-zope.i18nmessageid \
python39-zope.interface \
python39-zope.schema"

inherit rpm
