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

RPM_NAME = "python39-zope.configuration-4.4.1-2.1.noarch.rpm"
RPM_HASH = "34008f4b75dadc31266a60aa21477fa582e42df6f25ce0060aa4c18b8b646569b35fe13694d6ba5be79eb13ecb4bbaf02ff48d4025185be88af85aa465db38e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-zope.configuration \
python39-zope.configuration \
python3dist-zope.configuration"

RDEPENDS:${PN} += "python-abi \
python39-zope.i18nmessageid \
python39-zope.interface \
python39-zope.schema"

inherit rpm
