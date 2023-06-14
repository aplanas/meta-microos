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

RPM_NAME = "python311-zope.configuration-4.4.1-2.1.noarch.rpm"
RPM_HASH = "fd143305bc4970b20746d993d146280b874bbec2c9c011fcf119d9d64e25a40137861126bcf51e0e1fc293b1db2b9a371107d9c08f524e7bf4f614bff8a10ecf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-zope.configuration \
python311-zope.configuration \
python3dist-zope.configuration"

RDEPENDS:${PN} += "python-abi \
python311-zope.i18nmessageid \
python311-zope.interface \
python311-zope.schema"

inherit rpm
