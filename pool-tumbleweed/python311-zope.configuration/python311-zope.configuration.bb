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

RPM_NAME = "python311-zope.configuration-4.4.1-2.2.noarch.rpm"
RPM_HASH = "d5cf88e62d24fffb2bbdf538ae1d541824ae7de8e2c63e8d58782bb85e1cff689c63c8fd32e2c4f38942002179f2dee023d20dbab9a49630b0737894da1b3731"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zope.configuration \
python3.11dist-zope.configuration \
python311-zope.configuration \
python3dist-zope.configuration"

RDEPENDS:${PN} += "python-abi \
python311-zope.i18nmessageid \
python311-zope.interface \
python311-zope.schema"

inherit rpm
